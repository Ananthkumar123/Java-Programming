package com.programmes.oops;

public class Dimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		c1 child =new c1();
		child.add();
	}

}
interface I1
{
	void add();
	
}
interface I2 extends I1
{
	void sub();
}
interface i3 extends I1
{
	void div();
}
class c1 implements I2,i3
{
	public void add()
	{
		System.out.println("add");
	}
	public void sub()
	{
		System.out.println("sub");
	}
	public void div()
	{
		System.out.println("sub");
	}
}
