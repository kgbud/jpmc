package com.welcome;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>List = new ArrayList();
		List.add("Ram");
		List.add("Kailash");
		List.add("Subhan");
		
		System.out.println(List.size());
		System.out.println();
		System.out.println(List);
		System.out.println();
		System.out.println("After cloning:"+ List.clone());
		System.out.println("After cloning the size equals to :"+ List.size());
		System.out.println();
		List.clear();
		System.out.println("After clearing list :" + List);

	}

}
