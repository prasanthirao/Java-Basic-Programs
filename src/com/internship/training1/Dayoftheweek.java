package com.internship.training1;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Dayoftheweek {
	public static void main(String[] args) {
		System.out.println("enter any day number from 1-7");
		Scanner scan = new Scanner(System.in);

		int day = scan.nextInt();

		System.out.println(DayOfWeek.of(day).minus(1));

		scan.close();

	}




}
