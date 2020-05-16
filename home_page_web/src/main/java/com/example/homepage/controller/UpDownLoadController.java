package com.example.homepage.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;


@RestController
@RequestMapping("/upDownLoad")
public class UpDownLoadController {


    @RequestMapping("/downLoadImage")
    public ResponseEntity<byte[]> downLoad(HttpServletResponse response,String photoPath) throws IOException {

        String replace = photoPath.replace("/", "\\");
        String realPath = "D:\\IdeaProjects2019.3\\graduation_project\\home_page_web\\src\\main\\resources\\static\\";

        String substring = replace.substring(replace.lastIndexOf("\\"));
        String filename = substring.substring(1);

        File file = new File(realPath+replace);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment", filename);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        return new ResponseEntity<>(FileUtils.readFileToByteArray(file), headers, HttpStatus.OK);


    }


}
