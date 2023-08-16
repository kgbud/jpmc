package com.welcome;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		int cont = 0;
		
		/*for(int i =1; i<=num; i++) {
			if (num % i ==0) {
				cont = cont + 1;	
			}
		}
		if (cont == 2) {
			System.out.println(num + " is prime number");	
		}
		else {
			System.out.println(num + " is not prime number");
		} */
		
		int i =1;
		
		while(i <= num) {
			if (num % i ==0) {
				cont = cont + 1;
		}
			i++;
			

	}
		if (cont == 2) {
			System.out.println(num + " is prime number");	
		}
		else {
			System.out.println(num + " is not prime number");
		}
	}
}
