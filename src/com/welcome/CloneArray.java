package com.welcome;
import java.util.ArrayList;
import java.util.Collections;


public class CloneArray {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		
		array.add(3);
		array.add(5);
		array.add(7);
		array.add(10);
		array.add(9);
		
		System.out.println(array.size());
		System.out.println(array);
		System.out.println(array.clone());
		//array.clear();
		System.out.println("After clearing "+ array);
        
        System.out.println("Does the list contains 5?" + array.contains(5));
        
        System.out.println("The max number is "+ Collections.max(array));
		System.out.println("The min number is "+ Collections.min(array));

	}

}
