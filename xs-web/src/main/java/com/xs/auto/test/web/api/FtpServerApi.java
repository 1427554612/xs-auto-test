package com.xs.auto.test.web.api;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * minio server api
 */
public interface FtpServerApi {

    /**
     * 上传文件
     * @param directory
     * @return
     */
    public Map<String,Object> uploadFileBytes(byte[] fileBytes, String fileName, String contentType, String directory) throws Exception;

    /**
     * 下载文件
     * @param fileName
     * @return
     */
    public InputStream downloadFile(String fileName) throws Exception;

    /**
     * 获取文件链接
     * @param fileName
     * @return
     */
    public String getFileUrl(String fileName) throws Exception;

    /**
     * 删除文件
     * @param fileName
     */
    public void deleteFile(String fileName) throws Exception;

    /**
     * 获取所有文件列表
     * @return
     */
    public List<String> listFiles() throws Exception;
}
