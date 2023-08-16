package com.welcome;
import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan = new Scanner(System.in);
 
 System.out.println("Enter the first number");
 int num1 = scan.nextInt();
 
 System.out.println("Enter the second number");
 int num2 = scan.nextInt();
 
 if (num1>num2) {
	  System.out.println("Num1 is greater than num2");
	  
	  
	  }
	  else{
		  System.out.println("Num2 is gretaer than num1");
		  
 }
 
 if (num1%2==0 ) {
	 System.out.println("The number is even");
 }
 else {
	 System.out.println("Tne number is odd");
 }
	}
}

