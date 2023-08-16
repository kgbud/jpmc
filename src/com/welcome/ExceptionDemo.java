package com.welcome;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
		
			
			int[]numbers = {1,2,3};
			System.out.println(numbers[4]);
			
				}
		catch(Exception e) {
			System.out.println("Error is seen");
		}
		finally {
			System.out.println("Try catch is finished");
			
		}
					
				
			}
}
			
			

