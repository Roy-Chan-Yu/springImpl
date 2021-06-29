package com.pouchen.dto;

public class Students {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	public void displayInfo() {
		System.out.println("Hello " + this.name);
	}
}
