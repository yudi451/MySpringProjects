package org.aop.model;

import org.aop.aspect.Loggable;

public class Employee {
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	@Loggable
	public void setName(String s) {
		this.name = s;
	}
	
	public void throwException() {
		throw new RuntimeException("Dummy Exception");
	}
}
