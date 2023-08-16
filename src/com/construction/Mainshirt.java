package com.construction;
import java.util.Scanner;
public class Mainshirt {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		 Shirt s = new Shirt();//default constructor,//s is object// constructor is the method that makes object
		 s.putOn();// putOn is method
		 s.putOff();
		 s.color();
		 System.out.println("enter the size of your shirt");
		 String name = Scan.nextLine();
		 s.size(name);
		

	}

}
