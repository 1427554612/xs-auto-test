package com.xs.auto.test.ui_auto_test.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeParseUtil {

    private static final String DATA_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATA_FORMAT);

    /**
     * 获取格式化后字符串
     * @param date
     * @return
     */
    public static String getParseTime(Date date){
        return simpleDateFormat.format(date);
    }
}
