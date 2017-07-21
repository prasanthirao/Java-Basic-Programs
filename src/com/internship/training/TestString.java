package com.internship.training;

public class TestString {
	public static void main(String[] args) {

		String s = "Snoopy is my favourite"; // stringliteral
		String s1 = new String("Snoopy is my favourite");
		System.out.println(s);
		System.out.println(s1);
		System.out.println("comparsion of the strings using comparator" + s.compareTo(s1));
		System.out.println("using equal operator" + (s == s1));
		System.out.println("using equals method" + s.equals(s1));
		String s2 = "snoopy's age is:" + 2 + "years.";
		System.out.println(s2);
		System.out.println("concatted string is: " + s.concat(s2));
		System.out.println("substring is:" + s.substring(3, 9));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		String s3 = "      Tripsy is the new thing      ";
		System.out.println("the trimmed string is: " + s3.trim());
		System.out.println("the string starts with method:" + s.startsWith(s1));
		System.out.println("the string ends with method:" + s.endsWith("te"));
		System.out.println("the character at that index is:" + s.charAt(1));
		System.out.println("the lenghth of the string is:" + s.length());
		System.out.println("contains method:" + s.contains("my"));
		String s4 = s.toUpperCase();
		System.out.println("equals ignore case method:" + s.equalsIgnoreCase(s4));
		String s5 = "prashanthi";
		String sf1 = String.format("my name is %s", s5);
		System.out.println("the formatted string is:" + sf1);
		byte[] b = s.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		char[] ch = new char[10];
		s.getChars(2, 10, ch, 0);
		System.out.println(ch);
		int index = s.indexOf("fav");
		System.out.println("index of method" + index);
		String s6 = s1.intern();
		System.out.println("interned string: " + (s == s6));
		String s7 = "";
		System.out.println("string is empty method: " + s7.isEmpty());
		System.out.println("string is empty method: " + s.isEmpty());
		System.out.println("join string method: " + String.join("*", "im", "live", "in", "chennai"));
		System.out.println("last index od method: " + s.lastIndexOf('f'));
		System.out.println("replace method: " + s.replace("is", "was"));
		System.out.println("all replace method: " + s.replaceAll("s", "i"));
		String[] words = s.split("\\s");
		for (String w : words) {
			System.out.println(w);
		}
		char[] ch1 = s.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			System.out.println(ch1[i]);
		}
		int j = 10;
		String s8 = String.valueOf(j);
	System.out.println("value of method: " + s8 + 10);

	}
}