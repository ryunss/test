package com.lec.java.inherit04;

public class Vehicle {
	
	int speed;
	
	// 생성자
	public Vehicle() {
		System.out.println("Vehicle() 생성");
	}
	public Vehicle(int speed) {
		this.speed = speed;
		System.out.println("Vehicle() 생성: speed = "+speed);
	}
	
	
	
}
