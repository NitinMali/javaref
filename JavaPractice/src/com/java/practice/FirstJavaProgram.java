package com.java.practice;

public class FirstJavaProgram {
	
	public static void main(String[] str){
		System.out.println("Count "+SampleClass.getCount());
		SampleClass s1 = null;
		//System.out.println(s1.getName());
		s1 = new SampleClass("Vageesh","1",60);
		System.out.println(s1.getName());
		System.out.println(s1.getId());
		System.out.println(s1.getResult());
		System.out.println("Count "+SampleClass.getCount());
		
		SampleClass s2 = new SampleClass("Muthu","2",20);
		System.out.println(s2.getName());
		System.out.println(s2.getId());
		System.out.println(s2.getResult());
		System.out.println("Count "+SampleClass.getCount());
	}

}
