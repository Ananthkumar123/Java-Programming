package com.programmes.Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Custom_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Student> s = new ArrayList<>();
		 s.add(new Student (1,"ananth","ch20"));
		 s.add(new Student (2,"vamsi","ch21"));
		 s.add(new Student (3,"sankar","ch19"));
		 s.add(new Student (4,"mahesh","ch20"));
		 
		 System.out.println(s);
		 
		 
		 
		 
	}

}

class Student 
{
	int roll ;
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", section=" + section + "]";
	}
	public Student(int roll, String name, String section) {
		super();
		this.roll = roll;
		this.name = name;
		this.section = section;
	}
	String name ;
	String section;
}
class rollsort implements  Comparator<Student>
{
	

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		return Integer.compare(o1.roll, o2.roll);
	}
}


 