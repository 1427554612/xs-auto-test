package com.xs.auto.test.ui_auto_test.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 加密工具类
 */
public class EncryptUtil {

    /**
     * 加密为md5
     * @param input
     * @return
     */
    public static String md5(String input) {
        try {
            // 获取MD5摘要实例
            MessageDigest md = MessageDigest.getInstance("MD5");

            // 计算哈希值
            byte[] hashBytes = md.digest(input.getBytes());

            // 将字节数组转换为十六进制字符串
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5算法不可用", e);
        }
    }
}
