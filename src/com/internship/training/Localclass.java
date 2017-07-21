package com.internship.training;

public class Localclass {
	 
		 private int data=30;//instance variable  
		 void display(){  
		  class Local{  
		   void msg(){System.out.println(data);}  
		  }  
		  Local l=new Local();  
		  l.msg();  
		 }  
		 public static void main(String args[]){  
			 Localclass obj=new Localclass();  
		  obj.display();  
		 }  
}
