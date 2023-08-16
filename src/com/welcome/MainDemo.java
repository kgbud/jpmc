package com.welcome;

public class MainDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	
		Demo demo = new Demo();
		//demo.vote();
		
		try {
			demo.vote();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		demo.vote();

	}

}
