package com.welcome;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		char checkname;
		do{
		System.out.println("Enter the name" ); 
		String name = scan.nextLine();
		array.add(name);
		System.out.println("Wanna continue Y/N");
		checkname = scan.nextLine().charAt(0);
		
		}while (checkname == 'Y');
		for(String name1:array) {
			System.out.println(name1);
		}
		
			
		
				

		

	}

}