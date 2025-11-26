package com.xs.auto.test.ui_auto_test.utils;

import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;

public class MultipartFileUtil {

    /**
     * file转 MultipartFile
     * @param filePath
     * @return
     * @throws IOException
     */
    public static MultipartFile fileToMultipartFile(String filePath) throws IOException {
        System.out.println("当前文件名称为："+ filePath);
        File file = new File(filePath);
        String fileName = file.getName();
        String contentType = Files.probeContentType(file.toPath());
        try (FileInputStream input = new FileInputStream(file)) {
            return new MockMultipartFile(
                    "file",           // name
                    fileName,         // originalFilename
                    contentType,      // contentType
                    input             // content
            );
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(MultipartFileUtil.fileToMultipartFile("D:\\autotest\\2025-11-12-18-51\\testHome-success.png"));;
    }
}
