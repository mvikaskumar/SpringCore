package com.learning.removingXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.learning.removingXml")
//This annotation will handle all configuration of java.
public class JavaConfigurationClass {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean
	public Student getStudent() {

		// creating a student object
		Student student = new Student(getSamosa());
		return student;
	}

}
