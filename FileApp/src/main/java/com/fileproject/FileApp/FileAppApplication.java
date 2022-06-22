package com.fileproject.FileApp;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FileAppApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(FileAppApplication.class, args);

		File testFile = new File("123321", "txt","test");

		ServiceClass s = new ServiceClass();

		s.write(testFile);

		String str = s.read(testFile.getFilename());

		System.out.print(str);
	}

}
