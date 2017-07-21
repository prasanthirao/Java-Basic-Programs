package com.internship.training;

public class Memberclass {
	 private int data=30;  
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
	 public static void main(String args[]){  
		 Memberclass obj=new Memberclass();  
		 Memberclass.Inner in=obj.new Inner();  
	  in.msg();  
	 }  

}
