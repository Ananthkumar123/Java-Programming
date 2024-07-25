package com.programmes.oops;

public class Covarient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		  parent p = new child ();//upcasting
		   A x =p.sub();
		  x.add();		 
		
		

	}

}
class parent 
{
	A sub()
	{
		System.out.println("parent");
		A a = new A();
		return a;
	}
}
class child extends parent
{
	B sub()
	{
		System.out.println("chid");
		B b = new B();
		return b;
	}
	
}
class A
{
	void add()
	{
	System.out.println(10+20);
	}
}
class B extends A
{
	void add()
	{
	System.out.println(20+30);
	}
}