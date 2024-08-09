package com.by.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Address implements Serializable {
    private String provinceName;
    private String cityName;
     //省略get set toString方法
 }