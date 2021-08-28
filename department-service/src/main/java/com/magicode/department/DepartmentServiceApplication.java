package com.magicode.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		System.out.println("Inside DepartmentServiceApplication");
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
