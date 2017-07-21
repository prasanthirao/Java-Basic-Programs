package com.internship.training1;

import java.util.Scanner;

public class Average1 {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the english mark:");
   double a = sc.nextDouble();
   System.out.println("enter the science mark:");
   double b = sc.nextDouble();
   System.out.println("enter the maths mark:");
   double c = sc.nextDouble();
	double average = (a+b+c)/3;
	if(average >90)
	{
		System.out.println("A GRADE");
	}
	else if(average>80)
	{
		System.out.println("B GRADE");
	}
	else if(average>70)
	{
		System.out.println("C GRADE");
	}
	else 
	{
		System.out.println("D GRADE");
	}
	}




}
