package com.welcome;
import java.util.Scanner;
public class Positiveinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 int num;
		 
		 
		 
		 System.out.println("Enter any positive integer");
		 num = scan.nextInt();
		 
		 int i;
		 
          System.out.println("The multiplication is "+ num);
          
          for (i=1;i<=10;i++) {
        	  
        System.out.println(num +" x " +  i + "=" + (num*i));
          }
	    
         }
	}


