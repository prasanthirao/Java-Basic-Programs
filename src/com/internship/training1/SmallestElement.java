package com.internship.training1;

public class SmallestElement {
	public static void main(String[] args) {
		int data[] = { 20, 15, 3, 10, 1, 100, 50, 999, -2, -1 };
		int small = data[0];
		for (int i = 1; i < data.length; i++) {
			if (small > data[i]) {
				small = data[i];

			}
		}
		System.out.println("the smallest element is" + small);
		int result = small;
		int actual = -2;
		testCase(result, actual);

	}

	static void testCase(int res, int exp) {
		if (res == exp) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}
	}
}
