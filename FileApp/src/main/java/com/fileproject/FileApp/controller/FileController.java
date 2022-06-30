package com.fileproject.FileApp.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fileproject.FileApp.service.ServiceClass;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FileController {

    private final ServiceClass serviceClass;
    
    FileController(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }
        

    @RequestMapping(value = "/postText", method = RequestMethod.POST, consumes = "text/plain")
    public void postText(@RequestBody String content) throws IOException {
        System.out.println(content);
        serviceClass.write(content);

        //return content;
    };

    @GetMapping("/getText")
    public String getText() throws IOException {
        return serviceClass.read();
    }


}
