package com.internship.training;

public class MultipleInheritance {
	  
		void parent()
		{
			System.out.println("im the parent class");}  
		}  
		class Child extends MultipleInheritance{  
		void child(){
			System.out.println("im the child class");
			}  
		}  
		class D extends Child{  
		void hi(){
			System.out.println("Welcome to the family");}  
		  
		 
		public static void main(String args[]){  
		D d=new D();  
		d.parent();  
		d.child();  
		d.hi();  
		}
}  
