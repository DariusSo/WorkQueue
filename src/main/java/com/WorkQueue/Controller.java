package com.WorkQueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Blob;

@RestController
public class Controller {

    @Autowired
    Service service;

    @PostMapping("/email")
    public void saveEmail(@RequestBody Email email){
        service.saveEmail(email);
    }
    @PostMapping("/picture")
    public void savePicture(@RequestBody byte[] file) throws IOException {
        Picture picture = new Picture();
        picture.setPicture(file);
        service.savePicture(picture);
    }
}
