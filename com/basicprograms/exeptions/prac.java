package com.basicprograms.exeptions;

import java.io.IOException;

public class prac {

	public static void main(String[] args) throws Exception{
		
		 
 
	}

}

class c
{
	void m1() throws Exception
	{
		 m2();
		System.out.println("iam m1");
	}
	void m2() throws Exception
	{ 
		
		m3();
		System.out.println("iam m2");
	}
	void m3() throws Exception {
		throw new Exception() ;
		
	}
}