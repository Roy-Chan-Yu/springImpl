package com.pouchen.dto;

public class Employee {

	private Address address;
	private String name ;
	
	public Employee() {
		
	}
	
	public Employee(Address address) {
		this.address = address;
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(Address addr, String name) {
		this.address = addr;
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("Address: " + this.address.getAddress() + " Name: " + this.name);
	}
	
}
