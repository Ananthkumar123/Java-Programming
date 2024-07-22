package com.programmes.oops;

public class SingleInheritence {
	public static void main( String args[]) 
	{
		//single inheritence
		bike90cc b =new bike90cc();
		b.splender();
		b.child();
		
	}
}
class motor
{
	String bike ="herohonda";
	String price = "70k";
	 
	void splender()
	{
		System.out.println("iam the elder bike "+bike+"price of "+price);
	}
}
class bike90cc  extends motor
{
	void child()
	{
		System.out.println("her0");
	}
}
