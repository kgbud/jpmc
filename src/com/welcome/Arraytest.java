package com.welcome;
import java.util.ArrayList;
import java.util.Collections;

public class Arraytest {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
	
		array.add(5);
	    array.add(3);
	    array.add(7);
	    array.add(10);
	    array.add(1);
	     
	    for (Integer i:array) {
	    	System.out.println(array);
	    }
	    
	    System.out.println("Minimum value in the arraylist:" + Collections.min(array));
	   
	    System.out.println("Maximum value in the arraylist"+ Collections.max(array));
	}
}