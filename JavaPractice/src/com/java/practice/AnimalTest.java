package com.java.practice;

public class AnimalTest {
	
	public static void printAnimal(Animal anyAnimal){
		anyAnimal.eat();
		
		if(anyAnimal instanceof Dog){
			((Dog)anyAnimal).bark();
		}
		else if(anyAnimal instanceof Lion){
			((Lion)anyAnimal).roar();
		}
		
	}

	public static void main(String[] args) {		
		
		Animal anyAnimal = new Dog();		
		printAnimal(anyAnimal);
		
		
	}

}
