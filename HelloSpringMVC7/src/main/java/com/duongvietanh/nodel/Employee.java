package com.duongvietanh.nodel;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Employee {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Size(min=1,message="required")
	private String pass;
	
	@Min(value=18, message="must be equal or greater than 18")
	@Max(value=45, message="must be equal or less than 45")
	private int age;
	
		
	}
