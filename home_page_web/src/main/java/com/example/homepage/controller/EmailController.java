package com.example.homepage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.homepage.service.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import java.io.IOException;


@Controller
@RequestMapping("/email")
public class EmailController {

    @Reference
    private EmailService emailService;

    @RequestMapping("/send")
//    @Async
    public String sendTextEmail(Model model, String textEmail, String emailMessage) throws IOException, ServletException {

        emailService.sendTextEmail(textEmail,emailMessage);
        model.addAttribute("msg","邮箱发送成功");

        return "exception";

    }

}
