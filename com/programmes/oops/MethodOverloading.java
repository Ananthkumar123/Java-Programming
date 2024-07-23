package com.programmes.oops;

public class MethodOverloading {

	public static void main(String[] args) {
		//methodoverloading 	
		Method m =new Method();
		  m.Method();
		//System.out.println(m.Method(2,"hey"));
		
		
		
	}

}
class model 
{
	void add(int x)
	{
		System.out.println("model method");
	}
}
class Method extends model
{
	void Method()
	{ 
		super.add(1);
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
