package com.fileproject.FileApp.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fileproject.FileApp.model.File;
import com.fileproject.FileApp.service.ServiceClass;



@RestController
public class FileController {

    private final ServiceClass serviceClass;
    
    FileController(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }
        

    

    @GetMapping("/")
    public String index() throws IOException {
        File f = new File("ts", "txt", "test");
        serviceClass.write(f);
        String str = serviceClass.read(f.getFilename());
        return str;
    
    };
}
