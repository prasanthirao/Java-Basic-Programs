package com.internship.training1;

import java.util.Scanner;

public class Swap {
	
	public static void main(String[] args) {
		int z;
	do	
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number1:");
	int  a = sc.nextInt();
	System.out.println("enter the number2:");
	int b= sc.nextInt();
	 Swap sp = new Swap();
	  sp.swapping(a, b);
	 System.out.println("do you want to perform once more-1 for yes 2 for no?");
      z = sc.nextInt();     
	}
     while(z==1);
		
}
	void swapping(int number1 ,int number2)
	{
	 	 number2 = (number1+number2)-(number1=number2);
	System.out.println("the swapped numbers are"+number1+"&"+number2);
	}
	 	
	
		
	}
	
	



