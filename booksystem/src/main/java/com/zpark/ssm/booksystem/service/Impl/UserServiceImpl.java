package com.zpark.ssm.booksystem.service.Impl;


import com.zpark.ssm.booksystem.entity.User;
import com.zpark.ssm.booksystem.mapper.UserMapper;
import com.zpark.ssm.booksystem.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
