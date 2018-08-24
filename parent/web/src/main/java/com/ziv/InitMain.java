package com.ziv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ziv")
public class InitMain {

	public static void main(String[] args) {
		SpringApplication.run(InitMain.class);
	}

}
