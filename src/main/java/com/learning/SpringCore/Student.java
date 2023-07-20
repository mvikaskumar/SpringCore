package com.learning.SpringCore;

//This is known as bean class(Thats holds data).
public class Student {

	private int studentId;
	private String studentName;
	private String StudentAddress;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
		System.out.println("Setting Student ID.");
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("Setting Student Name.");
	}

	public String getStudentAddress() {
		return StudentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
		System.out.println("Setting Student Address.");
	}

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		StudentAddress = studentAddress;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", StudentAddress=" + StudentAddress
				+ "]";
	}

}
