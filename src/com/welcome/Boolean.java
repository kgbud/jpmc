package com.welcome;
import java.util.Scanner;
public class Boolean {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		boolean check;
    
      if (num%2==0) {
    	  System.out.println("The number is even");
	}
	else{
		System.out.println("The number is odd");
	}
      
      

}
}
