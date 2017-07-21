package com.internship.training;

import java.lang.StringBuffer;

public class TestString1 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("prashanthi");
		System.out.println("append method " + s1.append("is a good girl"));
		System.out.println("insert method: " + s1.insert(1, "retty"));
		System.out.println("replace method: " + s1.replace(1, 4, "abc"));
		System.out.println("delete method: " + s1.delete(0, 2));
		System.out.println("reverse method: " + s1.reverse());
		System.out.println("the string capacity is: " + s1.capacity());
		// System.out.println("its ensured capacity is : "+s1.ensureCapacity(10));
	}
}