package com.programmes.oops;

public class Constructor {

	public static void main(String[] args) {
		 
		 student s =new student(1,"ananth");
		 s.display();
		
	}

}
class student 
{
	 int id;
	 String name,designation;
	 String salary ="5 lpa";
	 student(int id,String name)
	 {
		 this.id=id;
		 this.name=name;
		 
	}
	 student (String salary)
	 {
		 this.salary=salary;
	 }
	 void display()
	 {
		 System.out.println(id+" "+" "+name+" "+salary);
	 }
	
}
