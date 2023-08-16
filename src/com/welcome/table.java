package com.welcome;
import java.util.Scanner;
public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pro = new Scanner(System.in);
		System.out.println("enter an integer");
		int num = pro.nextInt();
		//Using for loop
		for(int i = 1; i <=10;  i++) {
			System.out.println(num + " x " + i + " =" + num *i );
		}
	
		//Using while loop
		//while (int = i; i<11; i++) {
			//ystem.out.println(num + " x " + i + " =" + num *i );
		
		int j =1;
		
		while( j <= 10){
			
			
			
			System.out.println(num + " x " + j + " =" + num *j );
			j++;
			
		}
		do {
			
			j++;
			System.out.println(num + " x " + j + " =" + num *j );
			
			
			
		}while(j <= 10);
		}
			
		}

	


