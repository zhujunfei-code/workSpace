package com.zpark.ssm.booksystem.mapper;

import com.zpark.ssm.booksystem.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {
    //登录
    User login(User user);

    //根据用户id查询该用户
    User selectById(Integer id);

    int updateUser(User user);
}
