package com.learnng.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learnng/collections/collectionConfig.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCourses());
		
		System.out.println("Running successfully.........");

	}

}
