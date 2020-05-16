package com.example.homepage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.homepage.dao.UserMapper;
import com.example.homepage.service.UserService;
import com.example.po.User;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findUserByUemail(String uemail) {

        return userMapper.selectUserByUemail(uemail);

    }


}
