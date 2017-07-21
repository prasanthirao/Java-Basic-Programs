package com.internship.training;

public class Nestedclass {
	static int data=30;  
	  static class Inner{  
	   void msg(){System.out.println("data is "+data);}  
	  }  
	  public static void main(String args[]){  
	  Nestedclass.Inner obj=new Nestedclass.Inner();  
	  obj.msg();  
	  }  

}
