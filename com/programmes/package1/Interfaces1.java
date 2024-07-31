package com.programmes.package1;

public class Interfaces1 {

	public static void main(String[] args) {
		//  multiple inheritence
		 c c1 = new c();
		 c1.add();
		 c1.sub();
	}

}
interface i1 
{
	 void add();
}
interface i2 
{
 void sub();	
}
class c implements i1,i2
{  
	@Override
	public void add() {
		System.out.println("add");
	}
	
	public void sub()
	{
		System.out.println("sub");
	}
	
}