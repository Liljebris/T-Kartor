package com.fileproject.FileApp.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass implements IServiceClass {

  
  /** 
   * @param content
   * @throws IOException
   */
  // Write to file method, taken (but modified) from
  // https://www.geeksforgeeks.org/filewriter-class-in-java/
  public void write(String content) throws IOException {

    String ret = "";

    // Loads string ret with the path the this projects directory
    ret = System.getProperty("user.dir");

    // Adding on to the path for the "resources" folder
    ret = ret + "\\FileApp\\src\\main\\resources\\textFile.txt";

    // Instantiate a FileWriter that consumes the filepath
    // Creates a file if non is found
    FileWriter fWriter = new FileWriter(ret);

    // Loop through the content string characters and write them to file
    for (int i = 0; i < content.length(); i++)
      fWriter.write(content.charAt(i));

    fWriter.close();
  }

  
  /** 
   * @return String
   * @throws IOException
   */
  // Read file method, taken (but modified) from
  // https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
  public String read() throws IOException {

    String fileText = new String();
    int i;

    // Path configuration, same as for write method
    String ret = "";
    ret = System.getProperty("user.dir");
    ret = ret + "\\FileApp\\src\\main\\resources\\textFile.txt";

    try (

        FileReader fr = new FileReader(ret)) {

      // Looping through the filetext and load into string
      while ((i = fr.read()) != -1) {
        fileText += (char) i;
      }
    }

    return fileText;

  }

}
