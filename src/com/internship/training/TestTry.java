package com.internship.training;

public class TestTry {
 public static void main(String[] args) {
	try
	{
		int a[] = new int[5];
		a[5] = 30/0;
	}
	catch(ArithmeticException e)
	{
	System.out.println("task 1 ");
}
catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("task 2");
	}
 catch (Exception e) {System.out.println("common task");
	
 }
System.out.println("program done");
 }
}