package com.internship.training;

public class ThisKeyword {
	int age;
	String name;
	double salary;
	int id;

	public ThisKeyword(int age, String name, double salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public ThisKeyword(int age, String name, double salary, int id) {
		this(age, name, salary);
		this.id = id;

	}

	public double salaryIncrement() {
		if (age > 50) {
			salary = salary * 0.5;
			 return salary;
			//System.out.println("your salary is" + salary);
		} else
			return 0.0;
			//System.out.println();
	}

	public void mySalary() {
		
        double a = this.salaryIncrement();
}

	public static void main(String[] args) {
		ThisKeyword k1 = new ThisKeyword(21, "prash", 20);
		ThisKeyword k2 = new ThisKeyword(51, "sravs", 30, 678);
		k1.salaryIncrement();
		k2.salaryIncrement();
		k1.mySalary();
		k2.mySalary();
	}

}
