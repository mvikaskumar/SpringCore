package com.learning.removingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In this package, we Will practice code of how do we remove XML configuration.");

		@SuppressWarnings("resource")
		ApplicationContext contest = new AnnotationConfigApplicationContext(JavaConfigurationClass.class);

		Student student = contest.getBean("getStudent", Student.class);
		System.out.println(student);
		student.Study();

	}

}
