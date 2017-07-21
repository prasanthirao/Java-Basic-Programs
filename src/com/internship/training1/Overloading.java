package com.internship.training1;

import java.util.Scanner;

public class Overloading {
	double rectangle, triangle, square;
 static int z;
	static double constant = 0.5;

	public static void main(String[] args) {
	
		do
		{
		Overloading obj = new Overloading();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what is the side of a square?");
		double s = sc.nextDouble();
		double result = obj.method1(s);
		System.out.println("the area of the square is: "+result);
		double expected = 4;
		obj.testCase(result, expected);
		System.out.println("what is the length and the breadth of the rectangle?");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
       double result1 = obj.method1(l, b);
		System.out.println("the area of the rectangle is :"+result1);
       double expected1 = 10;
		obj.testCase(result1, expected1);
		System.out.println("what is the base and height?");
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		double result2 = obj.method1(constant, base, height);
		System.out.println("the area of the triangle is:"+result2);
		double expected2 = 10;
		obj.testCase(result2, expected2);
		System.out.println("Enter 1 for yes or enter 2 for no");
		z =sc.nextInt();
	   
	   }
		
		while(z==1);
	
	}	
	double method1(double s) {
		square = s * s;
		// System.out.println("the area of the square is:"+square);
		return square;

	}

	double method1(double l, double b) {
		// System.out.println("the are of the rectangle is:"+l*b);
		rectangle = l * b;
		return rectangle;
	}

	double method1(double constant, double base, double height) {
		// System.out.println("the area of the triangle is:"+constant*base*height);
		triangle = constant * base * height;
		return triangle;
	}

	void testCase(double res, double exp) {
		if (res == exp)
			System.out.println("test passes");
		else
			System.out.println("test fails");

	}
}
