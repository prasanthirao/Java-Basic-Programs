package com.internship.training;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("cat");
		al.add("mat");
		al.add(null);
		al.add("sat");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add("banana");
		al.set(0, "");
		System.out.println(al);

	}

}
