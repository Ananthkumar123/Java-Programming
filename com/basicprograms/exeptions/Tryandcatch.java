package com.basicprograms.exeptions;

public class Tryandcatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(10/0);
			 
		}
		catch(ArithmeticException t) {
			System.out.println("it is exeption ");
		}
		
		
		
		try {
			int ar[] =new int[4];
			System.out.println(ar[4]);
		}
		catch(ArrayIndexOutOfBoundsException t)
		{
			System.out.println("it index out bounce");
		}

	}

}
