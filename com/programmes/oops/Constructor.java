package com.programmes.oops;
//constructor overloading
public class Constructor {

	public static void main(String[] args) {
		 
		student s = new student(); //passing parameter values, 
//		fail f =new fail();
//		f.add(3,5);//method calling
	}

	
}
class Teacher{
	Teacher(){
		System.out.println("I am Teacher constructor");
	}
	Teacher(int x){
	
	}
}
class student extends Teacher
{ 
	int x=10;
	int y=20;
	
	 student()
	 {   
		 this(10,20.0);
		 System.out.println(x+y +"default constructor");
	 }
	 student(int a,int b)
	 {  
		super();
		 System.out.println(a+b + " constructor with  2 parameters ");
	 }
	 student(int x ,double y)
	 {
		 this(2,3);
		 this.x = x;
		 System.out.println( x+y +"oreder of ");
	 }
	
}
class Method extends student

{
	void Method()
	{   
		
		System.out.println("default method ");
	}
	
	void Method(int x, int y)
	{ 
		 
		System.out.println("second method"+x+y);
	}
	String Method(int x,String y)
	{
		return x+y;
	}
	
}