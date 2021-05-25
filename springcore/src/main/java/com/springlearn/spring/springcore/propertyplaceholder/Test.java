package com.springlearn.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springlearn/spring/springcore/propertyplaceholder/config.xml");
	myDAO dao=(myDAO)context.getBean("myDAO");
	System.out.println(dao);
 }
}
