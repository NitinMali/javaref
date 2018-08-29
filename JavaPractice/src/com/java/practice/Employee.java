package com.java.practice;

public class Employee implements Comparable<Employee>{

	private String name;
	
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	@Override
	public boolean equals(Object obj){
		System.out.println("Equals");
		if(obj instanceof Employee){
			return this.id == ((Employee)obj).id && this.name.equals(((Employee)obj).name); 
		}
		return false;
	}	
	
	@Override
	public int hashCode(){
		return this.id;
	}

	@Override
	public int compareTo(Employee o) {
		return o.id-this.id;
	}
	
}
