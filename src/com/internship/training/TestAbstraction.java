package com.internship.training;

abstract class Shape { // abstract class
	abstract void draw(); // abstract methods

	abstract void color();

	Shape() {
		System.out.println("I like this shape");
}
}


class Circle1 extends Shape { //abstraction
	void draw() {
		System.out.println("im circle");
	}

	void color() {
		System.out.println("im in red color");
	}
}

  class Square extends Circle1 { 
	void color() {
		System.out.println("im in pink color");
	}
}

public class TestAbstraction {
	public static void main(String[] args) {
Shape s =new Square();
s.color();
s.draw();
		
		
	}
}


