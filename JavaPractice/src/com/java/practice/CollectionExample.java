package com.java.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample {
	
	public static void main(String[] s){
		
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(1);
		System.out.println(arrayList);
		
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(9);
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(1);
		System.out.println(hashSet);
		
		hashSet = new LinkedHashSet<>();
		hashSet.add(9);
		hashSet.add(10);
		hashSet.add(12);
		hashSet.add(55);
		System.out.println(hashSet);
		
		hashSet = new TreeSet<>();
		hashSet.add(9);
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(1);
		System.out.println(hashSet);
		
		Set<Employee> empSet = new HashSet<>();
		Employee emp1 = new Employee("Nitin", 456);
		Employee emp2 = new Employee("Marimuthu", 123);
		empSet.add(emp1);
		empSet.add(emp2);
		System.out.println(empSet);
		
		 empSet = new TreeSet<>();
			empSet.add(emp1);
			empSet.add(emp2);
			System.out.println(empSet);
		
	}

}
