package com.zking.test.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/img")
public class UploadController {

    private  String saveDir="D:\\img\\";



    @RequestMapping("/toUpload")
    public String toUpload(){
        return "upload";
    }


    @PostMapping("/upload")
    public String upload(MultipartFile[] imgs) throws  Exception{
        for (int i=0; null!=imgs&&i<imgs.length;i++){
            MultipartFile img=imgs[i];
            String fileId= UUID.randomUUID().toString().replace("-","");
            File targetFile=new File(saveDir+fileId);
            img.transferTo(targetFile);
            System.out.println(img.getOriginalFilename());
        }
        return "redirect:/img/toUpload";
    }



}
