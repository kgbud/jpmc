package com.welcome;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Arraypractice {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<>();
		
		array.add(3);
		array.add(5);
		array.add(7);
		array.add(10);
		array.add(9);
		
		System.out.println(array);
		
		int sum = 0;
		
		for (int i = 0; i < array.size(); i++) {
		    sum += array.get(i);
		}
		
		System.out.println("The sum of the numbers is: " + sum);
		


		System.out.println("The max number is "+ Collections.min(array));
		System.out.println("The min number is "+ Collections.max(array));


	}

}
