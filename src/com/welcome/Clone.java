package com.welcome;
import java.util.ArrayList;


public class Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>List = new ArrayList();
		List.add("Ram");
		List.add("Kailash");
		List.add("Subhan");
		List.add("Sam");
		List.add("John");
		
		System.out.println(List.size());
		System.out.println(List);
		System.out.println(List.clone());
		System.out.println("After cloning, the list size "+ List.size());
		
		System.out.println("After clearing list :" + List);
	
		
		List.clear();
		
		
		
	}
	

}
