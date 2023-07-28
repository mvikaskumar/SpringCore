package com.learning.removingXml;

import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student {
	
	public void Study() {
		System.out.println("Students are doing study..");
	}
}
