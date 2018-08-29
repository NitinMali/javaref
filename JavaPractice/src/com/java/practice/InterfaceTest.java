package com.java.practice;

public class InterfaceTest {
	int count;
	
	public static void displayAutomobile(Automobile automobile){
		automobile.accelerate();		
	}
	
	public static void displayBike(Bike bike){
		bike.accelerate();
	}
	
	public static void displayCar(Car car){
		car.accelerate();
	}

	public static void main(String[] args) {

		Bike bike = new Bike();
		Car car = new Car();
		displayBike(bike);
		displayCar(car);
		displayAutomobile(bike);
		displayAutomobile(car);
		
	}

}
