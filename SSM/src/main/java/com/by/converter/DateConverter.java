package com.by.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {

        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dataFormat.parse(source);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
