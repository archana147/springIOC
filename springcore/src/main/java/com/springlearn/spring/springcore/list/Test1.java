package com.springlearn.spring.springcore.list;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springlearn/spring/springcore/list/configHospital.xml");
		Hospital h=(Hospital)context.getBean("Hospital");
		System.out.println(h.getName());
		System.out.println(h.getDepartments().getClass());
	}

}
