package com.welcome;
import java.util.Scanner;

public class Primesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		 int num=0;
		 int sum =0;
		 int i;
		 int j;
		 
		  
		 for (i=1;i<=10;i++) {
			 int count=0;
			 
			 
			 for(j=1;j<=i;j++) {
				 
			 if (i%j==0) {
				 
				 count++;
				 
				
				 
				 
			 }
		 }
 if (count ==2) {
				 
				 sum = sum+i;
		
				 
}
}
		 System.out.println("the sum is "+ sum);
}
}
