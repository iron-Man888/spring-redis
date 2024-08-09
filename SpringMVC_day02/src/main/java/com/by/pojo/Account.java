package com.by.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double money;
    private Address address;
    private Date date;
   //省略get set toString方法
 }