package com.welcome;

public class Asciinew {

	public static void main(String[] args) {
		  
    char c = 'a';
    int asciivalue = c;
    
    int i = 1;
    while(i<27) {
    	
    
    	System.out.println( "The ascii value of " + c  + " is " + asciivalue);
        asciivalue = asciivalue +1;
        c = (char)asciivalue;
    	i = i+1;
    }
    
    
    char c1 = 'A';
    int asciivalue1 = c1;
    
    int j = 1;
    while(j<27) {
    	
    	
    	System.out.println( "The ascii value of " + c1  + " is " + asciivalue1);
        asciivalue1 = asciivalue1 +1;
        c1 = (char)asciivalue1;
        j = j+1;
    }
    
    
    
    
	}

}
