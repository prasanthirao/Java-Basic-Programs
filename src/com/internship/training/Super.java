package com.internship.training;

public class Super {
	String color = "black";
	void run()
	{
		System.out.println("im running");
	}
    void bark()
    {
    	System.out.println("im barking");
    }
class Dog extends Super{
String color = "white";
void run()
{
	System.out.println("im running fastly");
}
void bark()
{
	System.out.println("im barking loudly");
}
void wrap()
{
	super.bark();
	bark();
	super.run();
	run();
}
void print()
{
	System.out.println(color);
	System.out.println(super.color);
}
}
class TestSuper1{
public void main(String[] args)
{
	



	Dog d = new Dog();
	d.wrap();
	d.print();
}
}
}
