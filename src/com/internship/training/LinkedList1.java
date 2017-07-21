package com.internship.training;

import java.util.Iterator;
import java.util.LinkedList;

class Student1 {
	int id;
	String name;
	int standard;
	String favouriteSubject;

	Student1(int id, String name, int standard, String favouriteSubject) {
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.favouriteSubject = favouriteSubject;
	}
}

public class LinkedList1 {
	public static void main(String[] args) {
	LinkedList<Student1> lu = new LinkedList<Student1>();
	Student1 s1  = new Student1(1,"'blah",2,"english");
	Student1 s2 = new Student1(2,"bleh",2,"science");
	Student1 s3 = new Student1(2,"bluh",2,"maths");

      lu.add(s1);
      lu.add(s2);
      lu.add(s3);
     for(Student1 s :lu)
     {
    	 System.out.println(s.id+" "+s.name+" "+s.standard+" "+s.favouriteSubject);
      }
      
      
	} 
}
