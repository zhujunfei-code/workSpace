package com.zpark.ssm.booksystem.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String password;
    private Integer age;
    private Integer sex;
    private String nickname; //昵称
    private Integer usertype; //用户类型 0表示普通用户 1表示管理员
    private String picture;
    private Integer state;
}
