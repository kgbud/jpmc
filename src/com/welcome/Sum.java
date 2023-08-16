package com.welcome;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		//System.out.println("Enetr an integer");
		//int sum = scan.nextInt();
		int i;
		int sum =0;
		
  for(i =1;i<=10;i++) {
	  sum = sum + i;
}
  
  System.out.println("The sum of the number is "+ sum);
  
  i = 1;;
  sum = 0;
  while( i<=10) {
	 
	 sum = sum +i;
	 i ++;
	 
  }
  
  System.out.println("The sum is "+ sum);
	}
	

}
