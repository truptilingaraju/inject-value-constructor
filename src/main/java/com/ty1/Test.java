package com.ty1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("my_config.xml");
		Teacher teacher=(Teacher)context.getBean("myTeacher");
		System.out.println(teacher);
	}
	
}
