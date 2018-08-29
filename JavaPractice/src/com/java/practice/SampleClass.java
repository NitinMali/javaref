package com.java.practice;

public class SampleClass {

	private String name;
	
	private String id;
	
	private static int count=0;
	
	private int score;
	
	public SampleClass(){
		
	}

	public SampleClass(String name1, String id1, int score1) {
		super();
		name = name1;
		id = id1;
		count++;
		score = score1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		SampleClass.count = count;
	}
	
	
	public String getResult(){
		if(score > 35)
			return "Pass";
			else
				return "Fail";
	}
	
}
