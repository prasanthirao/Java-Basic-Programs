package com.internship.training;

 public class Circle
	{
		 
		
		Circle_1 ag;
		final double PI = 3.14;
		public double area (int radius)
		{
		ag = new Circle_1();
				double rsquare = ag.square(radius);
				return PI *rsquare;
		}
		
		
		public static void main(String[] args) {
			Circle c = new Circle();
					double result = c.area(2);
					System.out.println(result);
			
		}
	}
 
 class Circle_1 {
	 public int square(int n)
	 {
		 return n*n;
	 }
 }
	

	
	
	





