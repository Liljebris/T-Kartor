package com.fileproject.FileApp.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fileproject.FileApp.service.ServiceClass;



@RestController
public class FileController {

    private final ServiceClass serviceClass;
    
    FileController(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }
        

    
    // GET request for retrieving the filecontent
    @GetMapping("/getText")
    public String getText() throws IOException {
        String text =  serviceClass.read();
        return text;
    };

    // POST request for pasting text into the file
    @PostMapping("/postText")
    public void postText(String text) throws IOException {
        serviceClass.write(text);
    }
}
