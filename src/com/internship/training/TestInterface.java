package com.internship.training;

interface Printable {
	void print();
}

//interface Showable {
//	void show();
//}
Class A  implements Printable, Showable{

public 	void print() {
		System.out.println("implementing  printable interface");
	}
//
//	public void show()
//   {
//   System.out.println("implementing showable interface");	   
//   }
}

public class TestInterface {
	public static void main(String[] args) {
		A a = new A();
		a.show();
		a.print();
   
	}
}
