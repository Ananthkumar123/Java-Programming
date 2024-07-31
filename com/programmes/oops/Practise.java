package com.programmes.oops;

public class Practise {

	public static void main(String[] args) {
		//    overloading 2 types of constructor overloading and method overloading
		
		balla m = new balla("ana","dev",9);
		balla m2 = new balla( 123 );
		//mahismathi
		
	}

}
class balla
{  String name,designation;
	int id,salary;
	
	balla(String name,String designation,int id)
	{
		 
		System.out.println( name+designation+id);
	}
	balla(int salary)
	{
		this.salary=salary;
		System.out.println(this.salary);
	}
	 
}
//class bahu extends balla
//{
//  	
//}