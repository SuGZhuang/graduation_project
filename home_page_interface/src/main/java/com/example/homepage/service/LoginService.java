package com.example.homepage.service;

import com.example.po.User;

import java.util.List;


public interface LoginService {

    void addUser(User user);

    List<User> getUserByUnameAndUpassword(String uname,String upassword);

}
