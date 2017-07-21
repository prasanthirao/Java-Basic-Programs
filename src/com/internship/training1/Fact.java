package com.internship.training1;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int a = sc.nextInt();
		Fact fa = new Fact();
		int result = fa.factorial(a);
		int expected = 20;
		System.out.println("the factorial of the number" + a + "is" + result);
		fa.testCase1(result, expected);
		sc.close();

	}
	

	int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}

	void testCase1(int res, int exp) {
		if (res == exp)

		{
			System.out.println("test pass");
		} else {
			System.out.println("test fails");
		}
	}
}
