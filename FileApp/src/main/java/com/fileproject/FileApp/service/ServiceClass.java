package com.fileproject.FileApp.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import org.springframework.stereotype.Service;

import com.fileproject.FileApp.model.File;

@Service
public class ServiceClass implements IServiceClass {

    // Write to file class taken from https://www.geeksforgeeks.org/filewriter-class-in-java/
    public void write(Object file) throws IOException {
        
        File f = (File) file;

        // FileWriter object loaded with filename
        FileWriter fWriter = new FileWriter(f.getFilename());
        
        // Goes through the characters in string "content"
        // from file class and write them into the created file 
        for (int i = 0; i < f.getContent().length(); i++)
            fWriter.write(f.getContent().charAt(i));

        fWriter.close();

        System.out.println(
                "File is created successfully with the content.");
    }

    // Read file method taken from https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
    public String read(String filename) throws IOException {

        String fileText = new String();
        int i;

        try (

            // Loading the file reader with a filepath. Temporary solution
            FileReader fr = new FileReader("C:\\Users\\lilje\\GitHub\\T-Kartor\\" + filename)) {
            
            // Looping through the filetext and load into string    
            while ((i = fr.read()) != -1) {
                fileText += (char)i;
            }
        }

        return fileText;

    }
    
}
