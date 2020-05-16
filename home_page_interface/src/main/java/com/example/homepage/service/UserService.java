package com.example.homepage.service;

import com.example.po.User;

import java.util.List;


public interface UserService {

    List<User> findUserByUemail(String uemail);

}
