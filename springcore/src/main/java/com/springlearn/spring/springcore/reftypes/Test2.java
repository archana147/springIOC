package com.springlearn.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springlearn/spring/springcore/reftypes/configRef.xml");
	Student student=(Student) context.getBean("student");
	System.out.println(student);
	}

}
