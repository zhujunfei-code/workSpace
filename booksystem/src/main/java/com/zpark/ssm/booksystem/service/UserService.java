package com.zpark.ssm.booksystem.service;

import com.zpark.ssm.booksystem.entity.User;


public interface UserService {
    User login(User user);

    //根据用户id查询该用户
    User selectById(Integer id);

    int updateUser(User user);
}
