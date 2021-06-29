package com.pouchen.dto;

public class Answer {

	private String name;
	private String by;
	
	public Answer() {
		
	}
	
	public Answer(String name, String by) {
		this.name = name;
		this.by = by;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
}
