package com.welcome;

import java.util.Scanner;

public class Evensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		int i;
		int sum = 0;
		
		
		System.out.println("Enetr an integer");
		 num = scan.nextInt();
	
		
		if (num % 2 ==0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is not even");
		}
		
		for (i=1; i<=10;i++) {
			if (i%2 ==0) {
				sum = sum +i;
					
			}
			
			
		
			
		}
		System.out.println("The sum of the first 10 even number is " + sum);
	}

	
	}	



