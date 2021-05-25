package com.springlearn.spring.springcore;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
		Employee emp=(Employee)ctx.getBean("emp");
		Scanner sc=new Scanner(System.in);
		//String id=sc.nextInt();
		String name=sc.nextLine();
		//System.out.println("Employee ID:"+emp.getId());
		//System.out.println("Employee Name:"+emp.getName());
		emp.display();
		
	}

}
