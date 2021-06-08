package com.example.project3;

import com.example.project3.controller.Project3Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@ComponentScan(basePackageClasses = Project3Controller.class)
public class Project3Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Project3Application.class, args);
	}

}
