package com.springlearn.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testconst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springlearn/spring/springcore/constructorinjection/configConstructor.xml");
		Employee e=(Employee)context.getBean("employee");
		System.out.println(e);
	}

}
