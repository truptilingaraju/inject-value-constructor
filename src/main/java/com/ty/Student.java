package com.ty;

public class Student {

	private String name;
	
	public void printName() {
		System.out.println("Student Name is: " + name);
	}
	
	public Student(String name) {
		this.name=name;
	}
}
