package com.example.homepage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.homepage.service.LoginService;
import com.example.homepage.service.UserService;
import com.example.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/auth")
public class LoginController {

    @Reference
    private LoginService loginService;

    @Reference
    private UserService userService;

    @RequestMapping("/register")
    public String register(Model model,User user) {

        String uemail = user.getUemail();
        List<User> userList = userService.findUserByUemail(uemail);
        if (userList !=null && userList.size() > 0) {
            model.addAttribute("msg","您已经注册过了");
            return "exception";
        } else {
            loginService.addUser(user);
            return "login";
        }
    }

    @RequestMapping("/login")
    public String userLogin(Model model,String uname,String upassword) {

        List<User> listUser = loginService.getUserByUnameAndUpassword(uname,upassword);

        if (listUser != null && listUser.size() > 0) {

            model.addAttribute("msg","欢迎您："+uname);
            model.addAttribute("status",true);
            model.addAttribute("visible","visible");

            return "index";
        } else {

            model.addAttribute("msg","用户名或者密码不正确");

            return "exception";

        }
    }


}
