package com.example.homepage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.homepage.dao.LoginMapper;
import com.example.homepage.service.LoginService;
import com.example.po.User;

import javax.annotation.Resource;
import java.util.List;


@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper loginMapper;

    @Override
    public void addUser(User user) {

        loginMapper.insertUser(user);

    }

    @Override
    public List<User> getUserByUnameAndUpassword(String uname,String upassword) {

        return loginMapper.selectUser(uname,upassword);

    }

}
