package com.internship.training;
public static void main(String[] args) {
	Test t = new Test();
	Overloading a = new Overloading();
	t.method1(a);
	Monkey m = new Monkey();
	t.method1(m);
	Overloading a1 = new Monkey();
	t.method1(a1);

public class Overloading1 {
	
	{
	class Monkey extends Overloading
	{
	}
	class Test 
	{
		public void method1(Overloading a)
		{
			System.out.println("animal version");
		}
		public void method1(Monkey m)
		{
			System.out.println("im a monkey version");
		}

}
	}
	}
}
	

