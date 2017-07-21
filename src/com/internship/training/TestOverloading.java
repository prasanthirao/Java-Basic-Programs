package com.internship.training;

public class TestOverloading {
	void method1(int a, int b) {
		System.out.println(a + b);
	}


	void method1(int a, String b) {
		System.out.println("my name is:" + b + "and my age is:" + a);
	}

	void method1(double a, double b) {
		System.out.println(a + b);
	}

	static class Overloading {
		public static void main(String[] args) {
			TestOverloading o = new TestOverloading();
			o.method1(11, 11);
			o.method1(3, "prash");
			o.method1(3, 5);

		}
	}
}
