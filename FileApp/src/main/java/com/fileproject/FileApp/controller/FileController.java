package com.fileproject.FileApp.controller;

import java.io.IOException;

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

    /**
     * @param content
     * @throws IOException
     */
    // RequestMapping HTTP method parameter with specified paraneter POST
    @RequestMapping(value = "/postText", method = RequestMethod.POST, consumes = "text/plain")
    public void postText(@RequestBody String content) throws IOException {
        serviceClass.write(content);
    };

    /**
     * @return ResponseEntity<String>
     * @throws IOException
     */
    // RequestMapping HTTP method parameter with specified parameter GET
    @RequestMapping(value = "/getText", method = RequestMethod.GET)
    public String getText(String test) throws IOException {

        return serviceClass.read();

    }

}
