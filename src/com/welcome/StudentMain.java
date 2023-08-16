package com.welcome;
import java.util.ArrayList;


public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student("Kailash ","Maths ", 26,105);
		Student student2 = new Student("Subhanjan ","Java ", 22,104);
		Student student3 = new Student("Rusal ","Network ", 24,103);
		Student student4 = new Student("Chetan ","Database ", 27,100);
		
		ArrayList<Student>students = new ArrayList<>();
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		
		

	}

}
