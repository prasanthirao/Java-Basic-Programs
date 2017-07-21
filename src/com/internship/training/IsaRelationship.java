package com.internship.training;

public class IsaRelationship {
	  
		 String collegeName = "vit";
		 int collegeId = 12345;
		 
		}  
		class Student5 extends IsaRelationship{  
		 int studentID = 1;  
		 public static void main(String args[]){  
		   Student5 s =new Student5();  
		   System.out.println("The name of the college and its id is"+s.collegeName+""+s.collegeId);  
		   System.out.println("Id of the student is"+s.studentID);  
		} 
	}  


