package com.welcome;
import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		String name;
		//int length;
		//boolean yes;
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the name you want to find the length");
		name = scan.next();
		
	
        
        System.out.println("The length of the name is "+name.length());
        
        System.out.println("The name contains " + name.contains("l"));
        
        System.out.println(name.replace('h', 'g'));
        
	}

}
