package com.java.practice;

public class Car implements Automobile {

	@Override
	public void accelerate() {
		System.out.println("Accelerating Car !");
	}

	public void itIsCarMethod(){
		System.out.println("It is a Car method !");
	}
}
