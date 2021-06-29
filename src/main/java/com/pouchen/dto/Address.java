package com.pouchen.dto;

public class Address {

	private String name;
	private String address;
	
	public Address() {
		
	}
	
	public Address(String name) {
		this.name = name;
	}
	
	public Address(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void show() {
		System.out.println("Address: " + this.address + " , Name: " +this.name);
	}
}
