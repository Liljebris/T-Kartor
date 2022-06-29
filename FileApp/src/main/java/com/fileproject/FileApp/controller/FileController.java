package com.fileproject.FileApp.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fileproject.FileApp.service.ServiceClass;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FileController {

    private final ServiceClass serviceClass;
    
    FileController(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }
        

    @PostMapping("/postText")
    public void postText(String content) throws IOException {
        serviceClass.write(content);
    };

    @GetMapping("/getText")
    public String getText() throws IOException {
        return serviceClass.read();
    }


}
