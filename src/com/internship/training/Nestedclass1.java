package com.internship.training;

public class Nestedclass1 {
  
		  static int data=30;  
		  static class Inner{  
		   static void msg(){System.out.println("data is "+data);}  
		  }  
		  public static void main(String args[]){  
		  Nestedclass1.Inner.msg();//no need to create the instance of static nested class  as its a static method
		  }

}
