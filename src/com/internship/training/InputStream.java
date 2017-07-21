package com.internship.training;

import java.io.FileInputStream;

public class InputStream {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("D:\\testout.txt");
			int k = 0;
			while ((k = fin.read()) != -1) {
				System.out.println((char) k);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
