package com.fileproject.FileApp;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FileAppApplication {

	
	/** 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		SpringApplication.run(FileAppApplication.class, args);
		
	}
}