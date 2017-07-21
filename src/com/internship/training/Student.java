package com.internship.training;

public class Student {
	static {
		System.out.println("hey");
	}
	int rollNumber;
	String name;
	static String college = "VIT";

	public Student(int roll, String n) {
		rollNumber = roll;
		name = n;
	}

	Student(Student s) {
		rollNumber = s.rollNumber;
		name = s.name;
	}

	public  void display()
	{
		System.out.println(rollNumber + "" + name + "" + college);
	}

	public static void main(String[] args) {

		Student s1 = new Student(123, "prash");
		Student s2 = new Student(s1);
		s1.display();
		s2.display();

	}
}
