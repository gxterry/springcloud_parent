package com.gx.sc.controller;

import com.gx.sc.clinet.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by GuoXin on 2018/5/9.
 */
@RestController
public class DcController {


    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        String str = dcClient.consumer();
        System.out.println(str);
        return  str;
    }
    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handleFileUpload(@RequestPart(value = "file") MultipartFile file){
        String str = dcClient.handleFileUpload(file);
        System.out.println(str);
        return  str;
    }
}
