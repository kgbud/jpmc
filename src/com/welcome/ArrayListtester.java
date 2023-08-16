package com.welcome;
import java.util.ArrayList;

public class ArrayListtester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step1 : create a object of Arraylist class
		
		ArrayList arrayList = new ArrayList();
		
		System.out.println("Is arraylist empty? " + arrayList.isEmpty());
		
		//Step2 : use add method
		
		arrayList.add(1);
		arrayList.add("abc");
		arrayList.add(true);
		arrayList.add(4.5);
		arrayList.add('a');
		arrayList.add("Kailash");
		
		System.out.println("is AL is still empty ? " +arrayList.isEmpty());
		
		System.out.println("does AL contains 100? "+ arrayList.contains(100));
		
		System.out.println("does AL contains 1? " + arrayList.contains(1));
		
		System.out.println("does AL contains kailash? " +arrayList.contains("kailash"));
		

	}

}
