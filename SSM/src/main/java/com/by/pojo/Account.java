package com.by.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private Integer id;
    private String name;
    private Double money;
    private String head;
    private Date date;
}
