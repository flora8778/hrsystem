package com.babyworld.util;
//返回格式化的当前日期
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static Date getDate() throws ParseException{
        Date date = new Date();   
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
        return sdf.parse(sdf.format(date));        
    }
}