package com.programmes.oops;

import java.util.Scanner;

public class custom_Exceptions {
	public static void main(String args[]) throws voterException
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" enter ur age");
		int age = s.nextInt();
		
		if(age>18 && age<60)
		{
			throw new voterException ( "ur not eligible");
		}
		else
		{
			System.out.println(" welcome voter plse register");
		}
	}

}
class voterException extends Exception
{
//	public voterException()
//	{	
//		super();
//	}

	public voterException(String  msg) {
		super(msg);
		 
	}
}
 