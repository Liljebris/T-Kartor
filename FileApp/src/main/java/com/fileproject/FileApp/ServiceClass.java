package com.fileproject.FileApp;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Service;;

@Service
public class ServiceClass implements IServiceClass {

    // Write to file class taken from https://www.geeksforgeeks.org/filewriter-class-in-java/
    public void write(Object file) throws IOException {
        
        File f = (File) file;

        // FileWriter object loaded with filename
        FileWriter fWriter = new FileWriter(f.getFileName());
        
        // Goes through the characters in string "content"
        // from file class and load them into the created file 
        for (int i = 0; i < f.getContent().length(); i++)
            fWriter.write(f.getContent().charAt(i));

        fWriter.close();

        System.out.println(
                "File is created successfully with the content.");
    }
    
}
