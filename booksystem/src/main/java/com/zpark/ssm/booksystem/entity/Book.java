package com.zpark.ssm.booksystem.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Book {
    private Integer id;
    private String name;
    private String author;
    private String publish;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date publishdate;
    private Integer page;
    private Integer price;
    private String content;
}
