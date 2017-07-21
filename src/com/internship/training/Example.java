package com.internship.training;

class Method{
	static int i = 0;
	public Method() {
		i++;
	}
	
	public int getCount() {
		return i ;
	}
	int sum(int a ,int b)
	{
	return a+b;
	}
   double sum(double a,double b,double c)
   {
	   return a+b+c;
   }
}



public class Example {
public static void main(String[] args) {
	Method m = new Method();
	System.out.println(m.getCount());
	int result= m.sum(5, 6);
	System.out.println(result);
	double result1 = m.sum(8.9, 6.7, 5.5);
	System.out.println(result1);
	Method m1 = new Method();
	System.out.println(m1.getCount());
	Method m2 = new Method();
	System.out.println(m2.getCount());
	
}
}
