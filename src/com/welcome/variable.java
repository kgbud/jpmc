package com.welcome;
import java.util.Scanner;

public class variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// start by dceclaring and initializing the variable
		// Adding two number
		int x, y , sum, product, division;
		Scanner myInt = new Scanner(System.in);// Creating a scanner object
		System.out.println("Enter the first number");
		x = myInt.nextInt();
		
		System.out.println("Enter the second number");
		y = myInt.nextInt();
		
		sum = x+y;
		System.out.println(" The sum of x and y is "+ sum);
		
		
		// Multiply two number
		product = x * y;
		System.out.println(" The product of two number is "+ product);
		
		//Dividing two numbers
		division = x/ y;
		System.out.println("The division of the number is "+ division);
	}
		
		
}

