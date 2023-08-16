package com.welcome;
import java.util.Scanner;

public class Demo {
		
	
	public static void vote() throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Your age");
		int age = sc.nextInt();
		try {

		if (age < 18) {

			throw new Exception("You can not vote");

		}
		}
		catch (Exception e) {



			System.out.println("You can vote");

		}
		catch(ArithmeticException e ) {
			
			System.out.println("Not Found");
		}
	finally {
			System.out.println("Congratulation! You can vote");
		}

	}
	
	
	
	
	

}


	