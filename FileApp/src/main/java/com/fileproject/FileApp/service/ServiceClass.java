package com.fileproject.FileApp.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



import org.springframework.stereotype.Service;


@Service
public class ServiceClass implements IServiceClass {

    // Write to file method, taken from https://www.geeksforgeeks.org/filewriter-class-in-java/
    public void write(String content) throws IOException {
        

        // There is still a need for some sort of validation for this method.

        // FileWriter object loaded with filename
        
      
        // Goes through the characters in string "content"
        // from file class and write them into the created file 

        String ret = "";
	    ret = System.getProperty("user.dir");
        ret = ret + "\\FileApp\\src\\main\\resources\\textFile.txt";
        
        FileWriter fWriter = new FileWriter(ret);

        
        for (int i = 0; i < content.length(); i++)
            fWriter.write(content.charAt(i));

        fWriter.close();
    }

    // Read file method taken from https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
    public String read() throws IOException {

        String fileText = new String();
        int i;

        String ret = "";
	    ret = System.getProperty("user.dir");
        ret = ret + "\\FileApp\\src\\main\\resources\\textFile.txt";

        try (

            // Loading the file reader with a filepath. Temporary solution

            

            FileReader fr = new FileReader(ret)) {

            
            // Looping through the filetext and load into string    
            while ((i = fr.read()) != -1) {
                fileText += (char)i;
            }
        }
        System.out.println(fileText);
        return fileText;

    }
    
}
