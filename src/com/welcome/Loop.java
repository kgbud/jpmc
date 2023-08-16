package com.welcome;
import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan = new Scanner(System.in);

 int i;
 
 System.out.println("The numbers are ");
 
 for(i=1;i<=10;i++) {
	 
	 System.out.println( i);
	 
	 
 }
 
	 
 int sum =0;
 for(i=1;i<=10;i++) {
	 sum = sum+i;
	 
 }
	 
 System.out.println("The sum of the first 10 numbers is "+ sum);
  
	}
	

}
