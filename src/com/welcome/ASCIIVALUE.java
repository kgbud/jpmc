package com.welcome;

public class ASCIIVALUE {

	public static void main(String[] args) {
		char ch = 'a';
		int asciivalue = ch;
		
		System.out.println("Ascii value for lowercase is : ");
		
		for(int a = 1; a < 27; a++) {
			
			
			
			 
			System.out.println( "The ascii value of " + ch  + " is " + asciivalue);
			asciivalue = asciivalue + 1;
			ch = (char) asciivalue;
			
			
			
			}
		
		char ch1 = 'A';
		int asciivalue1 = ch1;
		System.out.println("The ascii value for uppercase is :");
		
		for(int j= 1; j<=26;j++) {
			
			
			
			System.out.println( "The ascii value of " + ch1  + " is " + asciivalue1);
			asciivalue1 = asciivalue1 + 1;
			ch1 = (char) asciivalue1;
			
			
		}
	
		
	

	}
}



