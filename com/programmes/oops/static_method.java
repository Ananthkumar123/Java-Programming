package com.programmes.oops;

public class static_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent3 p =new parent3();
		p.add();

	}

}

class parent3 
{
	static int x =10;
	int y=20;
	static void add()
	{
		System.out.println(parent3.x);
		parent3 p =new parent3();
		System.out.println("sum is"+ p.y + parent3.x);
	}
	
	static  //block
	{
		System.out.println("it execute before class ");
	}
	parent3()
	{
		System.out.println("iam instance block");
	}
}

