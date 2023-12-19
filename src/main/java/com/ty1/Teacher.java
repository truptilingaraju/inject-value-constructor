package com.ty1;

public class Teacher {

	private String name;
	private int age;
	private double height;
	public Teacher(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	
}
