package com.internship.training;

public class String3 {
	public static void main(String[] args) {

		String string1 = "program";
		String string2 = "computer";
		char[] ch = string1.toCharArray();
		char[] ch1 = string2.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch1.length; j++) {
				if (ch[i] == ch1[j]) {
					ch1[j] = ' ';
				}
			}
		}
		String string3 = "";

		string3 = String.valueOf(ch1);
		System.out.println(string3.replaceAll("\\s", ""));
		// System.out.println(string3);
	}
	// System.out.println(string3.replaceAll("\\s", ""));
}
