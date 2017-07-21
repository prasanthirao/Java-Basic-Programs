package com.internship.training;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("e");
		al1.add("a");
		al.addAll(al1);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
