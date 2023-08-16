package com.welcome;
import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length for the array");
		int num = scan.nextInt();
		
		String[]names = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the stirng for " + i + " index");
			names[i]= scan.nextLine();
		}
		

		for (int j =0;j < num; j++) {
			System.out.println(" the string name  at the index " + j + " is "  + names[j]);
			
		}
		
		
	}
	
	
	}

