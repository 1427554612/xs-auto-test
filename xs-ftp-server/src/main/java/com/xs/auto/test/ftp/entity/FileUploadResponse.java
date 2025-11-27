package com.xs.auto.test.ftp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileUploadResponse {
    private String fileName;           // 存储的文件名（包含路径）
    private String originalFileName;   // 原始文件名
    private String fileUrl;            // 文件访问URL
    private String message;            // 操作消息
    private Long size;                 // 文件大小（字节）
    private String contentType;        // 文件类型
    private String uploadTime;         // 上传时间
}
