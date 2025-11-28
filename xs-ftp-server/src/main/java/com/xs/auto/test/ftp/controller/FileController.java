package com.xs.auto.test.ftp.controller;

import com.xs.auto.test.ftp.entity.FileUploadResponse;
import com.xs.auto.test.web.api.FtpServerApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/files")
@Slf4j
public class FileController {

    @Autowired
    private FtpServerApi minioFileService;

    /**
     * 查找存储桶中所有图片
     * @return
     */
    @GetMapping("/list-all")
    public ResponseEntity<List<Map<String, Object>>> listAllFiles() {
        try {
            List<String> fileNames = minioFileService.listFiles();
            List<Map<String, Object>> files = fileNames.stream()
                    .map(name -> {
                        Map<String, Object> fileInfo = new HashMap<>();
                        fileInfo.put("fileName", name);
                        fileInfo.put("fullPath", name);
                        fileInfo.put("simpleName", name.contains("/") ?
                                name.substring(name.lastIndexOf("/") + 1) : name);
                        return fileInfo;
                    })
                    .collect(Collectors.toList());

            return ResponseEntity.ok(files);
        } catch (Exception e) {
            log.error("获取文件列表失败", e);
            return ResponseEntity.internalServerError().build();
        }
    }

    /**
     * 图片上传
     * @param file
     * @param directory
     * @return
     */
    @PostMapping("/upload")
    public ResponseEntity<FileUploadResponse> uploadFile(
            @RequestParam("file") MultipartFile file,
            @RequestParam(value = "directory", defaultValue = "uploads") String directory) {

        try {
            if (file.isEmpty()) {
                FileUploadResponse errorResponse = new FileUploadResponse();
                errorResponse.setMessage("文件不能为空");
                return ResponseEntity.badRequest().body(errorResponse);
            }
            Map<String, Object> uploadMap = minioFileService.uploadFileBytes(file.getBytes(),file.getName(),file.getContentType(), directory);
            String fileUrl = minioFileService.getFileUrl((String) uploadMap.get("fileName"));

            // 使用setter方法创建响应对象
            FileUploadResponse response = new FileUploadResponse();
            response.setFileName((String) uploadMap.get("fileName"));
            response.setOriginalFileName(file.getOriginalFilename());
            response.setFileUrl(fileUrl);
            response.setMessage("文件上传成功");
            response.setSize(file.getSize());
            response.setContentType(file.getContentType());
            response.setUploadTime(java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            log.error("文件上传失败", e);
            FileUploadResponse errorResponse = new FileUploadResponse();
            errorResponse.setMessage("文件上传失败: " + e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    /**
     * 文件下载
     * @param fileName
     * @return
     */
    @GetMapping("/download" )
    public ResponseEntity<InputStreamResource> downloadFile(@RequestParam(value = "file") String fileName) {
        try {
            InputStream inputStream = minioFileService.downloadFile(fileName);
            InputStreamResource resource = new InputStreamResource(inputStream);

            // 获取原始文件名（去掉路径）
            String originalFileName = fileName.contains("/")
                    ? fileName.substring(fileName.lastIndexOf("/") + 1)
                    : fileName;
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION,
                            "attachment; filename=\"" + originalFileName + "\"")
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .body(resource);

        } catch (Exception e) {
            log.error("文件下载失败", e);
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/url/{fileName:.+}")
    public ResponseEntity<Map<String, String>> getFileUrl(@PathVariable String fileName) {
        try {
            String fileUrl = minioFileService.getFileUrl(fileName);
            return ResponseEntity.ok(Collections.singletonMap("url", fileUrl));
        } catch (Exception e) {
            log.error("获取文件URL失败", e);
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{fileName:.+}")
    public ResponseEntity<Map<String, String>> deleteFile(@PathVariable String fileName) {
        try {
            minioFileService.deleteFile(fileName);
            return ResponseEntity.ok(Collections.singletonMap("message", "文件删除成功"));
        } catch (Exception e) {
            log.error("文件删除失败", e);
            return ResponseEntity.internalServerError()
                    .body(Collections.singletonMap("error", "文件删除失败"));
        }
    }

    @GetMapping("/list")
    public ResponseEntity<List<Map<String, String>>> listFiles() {
        try {
            List<String> fileNames = minioFileService.listFiles();
            List<Map<String, String>> files = fileNames.stream()
                    .map(name -> {
                        Map<String, String> fileInfo = new HashMap<>();
                        fileInfo.put("fileName", name);
                        try {
                            fileInfo.put("url", minioFileService.getFileUrl(name));
                        } catch (Exception e) {
                            fileInfo.put("url", "");
                        }
                        return fileInfo;
                    })
                    .collect(Collectors.toList());

            return ResponseEntity.ok(files);
        } catch (Exception e) {
            log.error("获取文件列表失败", e);
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/base64/{fileName:.+}")
    public ResponseEntity<Map<String, String>> getImageAsBase64(@PathVariable String fileName) {
        InputStream inputStream = null;
        try {
            inputStream = minioFileService.downloadFile(fileName);

            // 兼容Java 8的读取方式
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            byte[] data = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(data, 0, data.length)) != -1) {
                buffer.write(data, 0, bytesRead);
            }
            byte[] imageBytes = buffer.toByteArray();

            String base64Image = Base64.getEncoder().encodeToString(imageBytes);

            // 确定MIME类型
            String mimeType = determineContentType(fileName);

            String dataUrl = "data:" + mimeType + ";base64," + base64Image;

            Map<String, String> result = new HashMap<>();
            result.put("dataUrl", dataUrl);
            result.put("mimeType", mimeType);
            result.put("fileName", fileName);
            result.put("size", String.valueOf(imageBytes.length));

            return ResponseEntity.ok(result);

        } catch (Exception e) {
            log.error("获取Base64图片失败: {}", fileName, e);
            Map<String, String> error = new HashMap<>();
            error.put("error", "获取图片失败: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    log.warn("关闭流失败", e);
                }
            }
        }
    }

    /**
     * 根据文件名确定Content-Type
     */
    private String determineContentType(String fileName) {
        if (fileName == null) {
            return "application/octet-stream";
        }
        String lowerFileName = fileName.toLowerCase();

        if (lowerFileName.endsWith(".jpg") || lowerFileName.endsWith(".jpeg")) {
            return "image/jpeg";
        } else if (lowerFileName.endsWith(".png")) {
            return "image/png";
        } else if (lowerFileName.endsWith(".gif")) {
            return "image/gif";
        } else if (lowerFileName.endsWith(".bmp")) {
            return "image/bmp";
        } else if (lowerFileName.endsWith(".webp")) {
            return "image/webp";
        } else if (lowerFileName.endsWith(".svg")) {
            return "image/svg+xml";
        } else if (lowerFileName.endsWith(".ico")) {
            return "image/x-icon";
        } else if (lowerFileName.endsWith(".tiff") || lowerFileName.endsWith(".tif")) {
            return "image/tiff";
        } else if (lowerFileName.endsWith(".pdf")) {
            return "application/pdf";
        } else if (lowerFileName.endsWith(".txt")) {
            return "text/plain";
        } else if (lowerFileName.endsWith(".html") || lowerFileName.endsWith(".htm")) {
            return "text/html";
        } else if (lowerFileName.endsWith(".css")) {
            return "text/css";
        } else if (lowerFileName.endsWith(".js")) {
            return "application/javascript";
        } else if (lowerFileName.endsWith(".json")) {
            return "application/json";
        } else if (lowerFileName.endsWith(".xml")) {
            return "application/xml";
        } else {
            return "application/octet-stream";
        }
    }
}
