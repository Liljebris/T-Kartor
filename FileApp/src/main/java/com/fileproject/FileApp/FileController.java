package com.fileproject.FileApp;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FileController {

    private final ServiceClass serviceClass;
    
    FileController(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }
        

    

    @GetMapping("/")
    public String index() throws IOException {
        File f = new File("testtest", "txt", "test");
        serviceClass.write(f);
        String str = serviceClass.read(f.getFilename());
        return str;
    
    };
}
