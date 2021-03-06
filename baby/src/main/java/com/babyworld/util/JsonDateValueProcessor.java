package com.babyworld.util;
//将日期转化使之能在 easyUI 的 datagrid 中正常显示
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

public class JsonDateValueProcessor implements JsonValueProcessor {

    private String format ="yyyy-MM-dd";  

    public JsonDateValueProcessor() {  
        super();  
    }  

    public JsonDateValueProcessor(String format) {  
        super();  
        this.format = format;  
    }  

    public Object processArrayValue(Object paramObject,  
            JsonConfig paramJsonConfig) {  
        return process(paramObject);  
    }  

    public Object processObjectValue(String paramString, Object paramObject,  
            JsonConfig paramJsonConfig) {  
        return process(paramObject);  
    }  


    private Object process(Object value){  
        if(value instanceof Date){    
            SimpleDateFormat sdf = new SimpleDateFormat(format,Locale.US);    
            return sdf.format(value);  
        }    
        return value == null ? "" : value.toString();    
    }
}