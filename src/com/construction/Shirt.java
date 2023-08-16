package com.construction;

public class Shirt {
	
	String color;
	char size;
	
	Shirt(){
		System.out.println("inside constructor");
	}
	
	public static void putOn() {
		System.out.println("Shirt is on");
	}
	
	public static void putOff() {
		System.out.println("Shirt is off");
	}
	
	public static void color() {
		System.out.println("Shirt is red color");
	}
   public static void size(String size) {
	   System.out.println(" the size of the shirt " + size);
   }
}
