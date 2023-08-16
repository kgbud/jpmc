package com.welcome;

import java.util.Scanner;

public class Oddnumsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int i;
		int sum = 0;
		
		for (i=1; i<=10;i++) {
			if (i%2 !=0) {
				sum = sum +i;
				
					
			}
	
			
	   }
		
		System.out.println("The sum of odd number from first 10 natural number is " + sum);
   }

	}



