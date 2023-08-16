package com.welcome;

import java.util.ArrayList;

public class Arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList arrayList = new ArrayList();
		
		System.out.println("Is arraylist empty? " + arrayList.isEmpty());
		
		//Step2 : use add method
		
		arrayList.add(1);
		arrayList.add("abc");
		arrayList.add(true);
		arrayList.add(4.5);
		arrayList.add('a');
		
		System.out.println("is AL is still empty ? " + arrayList.isEmpty());
		
		System.out.println("EL at index 3 is "+ arrayList.get(3));
		arrayList.add(3 ,"xyz");
		
		System.out.println("EL at index 3 after adding'xyz' is " + arrayList.get(3));
		
		arrayList.remove(3);
		
		System.out.println("EL at index 3 is "+ arrayList.get(3));
		
		arrayList.remove(2);
		System.out.println("EL at index 2 is" + arrayList.get(2));
	}

}
