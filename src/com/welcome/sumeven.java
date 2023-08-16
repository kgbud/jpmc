package com.welcome;

import java.util.Scanner;

public class sumeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num;
		int i;
		int sum = 0;
		
		for (i=1; i<=10;i++) {
			if (i%2 ==0) {
				sum = sum +i;
				
					
			}
	
			
	   }
		
		System.out.println("The sum of even number from first 10 natural number is " + sum);
   }
}
