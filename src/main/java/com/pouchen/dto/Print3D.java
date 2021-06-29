package com.pouchen.dto;

public class Print3D {

	Print2D a;
	
	public Print3D() {
		System.out.println("3D is created...");
	}
	public Print2D getA() {
		return a;
	}
	public void setPrint2d(Print2D a) {
		this.a = a;
	}

	public void print() {
		System.out.println("Hello 3D...");
	}
	
	public void display() {
		print();
		a.print();
	}
}
