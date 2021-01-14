package com.example.homepage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.homepage.service.EmailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import javax.annotation.Resource;


@Service
public class EmailServiceImpl implements EmailService {

    @Resource
    private JavaMailSenderImpl javaMailSender;

    @Value("${spring.mail.username}")
    private String from;

    @Override
    public void sendTextEmail(String textEmail,String emailMessage) {

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(textEmail);
        simpleMailMessage.setSubject("摄影网站用户反馈");
        simpleMailMessage.setText(emailMessage);

        javaMailSender.send(simpleMailMessage);

    }


}
