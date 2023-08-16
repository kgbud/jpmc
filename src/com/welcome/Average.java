package com.welcome;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int average;
		
		
		 
		System.out.println("Enter the first number");
		int num1= scan.nextInt();
		
		System.out.println("Enter the second number");
		int num2 = scan.nextInt();
		
		System.out.println("Enter the third number");
		int num3 = scan.nextInt();
		
		average = (num1+num2+num3)/3;
		 
		
		System.out.println("The average of three number is " + average);
		
		
		 

	}

}
