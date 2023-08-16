package com.welcome;

import java.util.ArrayList;
import java.util.Scanner;

public class Strdemo {
	boolean yes;

	public static void main(String[] args) {
		
		ArrayList<String>array = new ArrayList<String>();
		char checkname;
		
		String name ;
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter the name ");
    
    
    name = scan.nextLine();
    System.out.println(name);
    System.out.println("The length is "+ name.length());
    System.out.println("The name is " + name.replace('m', 'n'));
    System.out.println(name.contains("m"));

	}

}

