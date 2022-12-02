package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMvc23Application {

	public static void main(String[] args) {
		
		//Student s=new Student();
		//s.print();
		
		ConfigurableApplicationContext e=SpringApplication.run(SpringMvc23Application.class, args);
		Student s= e.getBean(Student.class);
		s.print();
	}

}
