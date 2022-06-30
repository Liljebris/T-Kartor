package com.fileproject.FileApp.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.fileproject.FileApp.model.File;

import org.springframework.stereotype.Service;


@Service
public class ServiceClass implements IServiceClass {

    // Write to file method, taken from https://www.geeksforgeeks.org/filewriter-class-in-java/
    public void write(String content) throws IOException {
        

        // There is still a need for some sort of validation for this method.
        System.out.println(content + " testestest");
        // FileWriter object loaded with filename
        FileWriter fWriter = new FileWriter("test.txt");
        
        // Goes through the characters in string "content"
        // from file class and write them into the created file 
        for (int i = 0; i < content.length(); i++)
            fWriter.write(content.charAt(i));

        fWriter.close();
    }

    // Read file method taken from https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
    public String read() throws IOException {

        String fileText = new String();
        int i;

        try (

            // Loading the file reader with a filepath. Temporary solution

            FileReader fr = new FileReader("C:\\Users\\lilje\\GitHub\\T-Kartor\\FileApp\\test.txt")) {

            
            // Looping through the filetext and load into string    
            while ((i = fr.read()) != -1) {
                fileText += (char)i;
            }
        }
        System.out.println(fileText);
        return fileText;

    }
    
}
