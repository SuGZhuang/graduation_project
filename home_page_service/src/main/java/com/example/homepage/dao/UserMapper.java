package com.example.homepage.dao;

import com.example.po.User;

import java.util.List;


public interface UserMapper {

    List<User> selectUserByUemail(String uemail);

}
