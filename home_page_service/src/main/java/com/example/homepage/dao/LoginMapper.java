package com.example.homepage.dao;

import com.example.po.User;

import java.util.List;


public interface LoginMapper {

    void insertUser(User user);

    List<User> selectUser(String uname,String upassword);

}
