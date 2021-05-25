package com.springlearn.spring.springcore.constructorinjection;

import com.springlearn.spring.springcore.reftypes.Scores;

public class Employee {
	private Marks marks;
	Employee(Marks marks){
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Employee [marks=" + marks + "]";
	}
	


	
}
