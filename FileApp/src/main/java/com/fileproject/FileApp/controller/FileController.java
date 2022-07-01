package com.fileproject.FileApp.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
        serviceClass.write(content);


    };

    @RequestMapping(value = "/getText", method = RequestMethod.GET)
    public ResponseEntity<String> getText() throws IOException {
        return ResponseEntity.ok(serviceClass.read());
    }


}
