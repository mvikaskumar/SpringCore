package com.learning.removingXml;

//@Component("firststudent")
public class Student {

	private Samosa samosa;

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void Study() {
		samosa.display();
		System.out.println("Students are doing study..");
	}
}
