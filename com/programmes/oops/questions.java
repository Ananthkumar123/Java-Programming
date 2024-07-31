package com.programmes.oops;

public class questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		person p = new person("ananth",22);
		p.add();
		p.sub();
		dog g =new dog("dog","geman shepord");
		 Circle c =new Circle ();
		 c.circle();
	}

}
class person
{
	String name ;
	int age ;
	person(String x,int y )
	{
		this.name=x;
		this.age=y;
		 System.out.println(x+" "+y);
	}
	void add()
	{
		
		System.out.println(name+" "+age);
	}
	void sub()
	{
		
		System.out.println(name+" "+age);
	}
}
class dog
{
	String name ;
	String breed;
	dog(String x ,String y)
	{
		name=x;
		breed =y;
	}
	 
}
class Circle
{
	double r =3;
	double Area =Math.PI;
	void circle()
	{
		double res = Area*r*r;
		System.out.println(res);
	}
}
class Book
{
	String title,authour;
	int isbn;
	void add()
	{
		System.out.println("");
	}
	
}