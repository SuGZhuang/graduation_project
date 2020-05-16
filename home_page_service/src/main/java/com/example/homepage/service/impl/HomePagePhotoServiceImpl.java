package com.example.homepage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.homepage.dao.HomePagePhotoMapper;
import com.example.homepage.service.HomePagePhotoService;
import com.example.po.HomePagePhoto;

import javax.annotation.Resource;
import java.util.List;


@Service
public class HomePagePhotoServiceImpl implements HomePagePhotoService {

    @Resource
    private HomePagePhotoMapper homePagePhotoMapper;

    @Override
    public List<HomePagePhoto> findAllHomePagePhoto() {

        return homePagePhotoMapper.selectHomePagePhoto();

    }


}
