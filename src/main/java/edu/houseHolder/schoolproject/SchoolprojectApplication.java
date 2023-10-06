package edu.houseHolder.schoolproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "edu.houseHolder.schoolproject") // Include the package containing your configuration class
@SpringBootApplication
public class SchoolprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolprojectApplication.class, args);
	}

}
