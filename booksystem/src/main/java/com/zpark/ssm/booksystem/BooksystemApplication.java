package com.zpark.ssm.booksystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zpark.ssm.booksystem.mapper")
public class BooksystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(BooksystemApplication.class, args);
    }

}
