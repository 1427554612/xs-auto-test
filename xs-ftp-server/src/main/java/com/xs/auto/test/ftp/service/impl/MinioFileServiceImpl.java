package com.xs.auto.test.ftp.service.impl;

import com.xs.auto.test.web.api.FtpServerApi;
import io.minio.*;
import io.minio.http.Method;
import io.minio.messages.Item;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.*;

@DubboService
@Slf4j
public class MinioFileServiceImpl implements FtpServerApi {

    @Value("${minio.bucket-name}")
    private String bucketName;

    @Value("${minio.endpoint}")
    private String endpoint;

    private final MinioClient minioClient;

    public MinioFileServiceImpl(MinioClient minioClient) {
        this.minioClient = minioClient;
    }

    @PostConstruct
    public void init() throws Exception {
        // 检查存储桶是否存在，不存在则创建
        boolean isExist = minioClient.bucketExists(BucketExistsArgs.builder()
                .bucket(bucketName)
                .build());
        if (!isExist) {
            minioClient.makeBucket(MakeBucketArgs.builder()
                    .bucket(bucketName)
                    .build());

            // 设置存储桶策略为公开读
            String policy = String.format(
                    "{" +
                            "\"Version\": \"2012-10-17\"," +
                            "\"Statement\": [" +
                            "    {" +
                            "        \"Effect\": \"Allow\"," +
                            "        \"Principal\": {\"AWS\": [\"*\"]}," +
                            "        \"Action\": [\"s3:GetObject\"]," +
                            "        \"Resource\": [\"arn:aws:s3:::%s/*\"]" +
                            "    }" +
                            "]" +
                            "}",
                    bucketName
            );

            minioClient.setBucketPolicy(SetBucketPolicyArgs.builder()
                    .bucket(bucketName)
                    .config(policy)
                    .build());
        }
    }

    /**
     * 通過二進制上傳
     * @param directory
     * @return
     * @throws Exception
     */
    @Override
    public Map<String,Object> uploadFileBytes(byte[] fileBytes, String fileName, String contentType, String directory) throws Exception {
        if (fileBytes == null || fileBytes.length == 0) {
            throw new IllegalArgumentException("文件字节数组不能为空");
        }
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("fileName",fileName);
        resultMap.put("content-type",contentType);
        resultMap.put("directory",directory);
        resultMap.put("fileSize",fileBytes.length);
        resultMap.put("fileUrl",this.getFileUrl(fileName));
        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(fileBytes)) {
            minioClient.putObject(PutObjectArgs.builder()
                    .bucket(bucketName)
                    .object(directory+"/"+fileName)
                    .stream(inputStream, fileBytes.length, -1)
                    .contentType(contentType != null ? contentType : "application/octet-stream")
                    .build());
            return resultMap;
        }
    }

    /**
     * 下载文件
     * @param fileName
     * @return
     * @throws Exception
     */
    @Override
    public InputStream downloadFile(String fileName) throws Exception {
        return minioClient.getObject(GetObjectArgs.builder()
                .bucket(bucketName)
                .object(fileName)
                .build());
    }

    /**
     * 获取文件地址
     * @param fileName
     * @return
     * @throws Exception
     */
    @Override
    public String getFileUrl(String fileName) throws Exception {
        // 生成预签名URL，有效期7天
        return minioClient.getPresignedObjectUrl(GetPresignedObjectUrlArgs.builder()
                .method(Method.GET)
                .bucket(bucketName)
                .object(fileName)
                .expiry(7 * 24 * 60 * 60) // 7天
                .build());
    }

    /**
     * 删除文件
     * @param fileName
     * @throws Exception
     */
    @Override
    public void deleteFile(String fileName) throws Exception {
        minioClient.removeObject(RemoveObjectArgs.builder()
                .bucket(bucketName)
                .object(fileName)
                .build());
        log.info("文件删除成功: {}", fileName);
    }

    /**
     * 获取所有文件
     * @return
     * @throws Exception
     */
    @Override
    public List<String> listFiles() throws Exception {
        List<String> fileNames = new ArrayList<>();
        Iterable<Result<Item>> results = minioClient.listObjects(ListObjectsArgs.builder()
                .bucket(bucketName)
                .build());

        for (Result<Item> result : results) {
            Item item = result.get();
            fileNames.add(item.objectName());
        }

        return fileNames;
    }

}
