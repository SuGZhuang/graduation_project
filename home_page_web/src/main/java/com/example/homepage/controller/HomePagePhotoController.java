package com.example.homepage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.homepage.service.HomePagePhotoService;
import com.example.po.HomePagePhoto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/homePage")
public class HomePagePhotoController {

    @Reference
    private HomePagePhotoService homePagePhotoService;

    @RequestMapping("/getHomePagePhoto")
    public Set<HomePagePhoto> getHomePagePhotoList() {


        List<HomePagePhoto> allHomePagePhoto = homePagePhotoService.findAllHomePagePhoto();

        Set<HomePagePhoto> homePagePhotoSet = new HashSet<>();

        for (HomePagePhoto photo : allHomePagePhoto) {

            homePagePhotoSet.add(photo);

        }

        return homePagePhotoSet;

    }


}
