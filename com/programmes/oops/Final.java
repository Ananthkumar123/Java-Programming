package com.programmes.oops;

public class Final {

	public static void main(String[] args) {
		
		 nana n = new amma();
		 n.add();

	}
	 
	}

	class nana
	{
		void add()
		{
			System.out.println("nana");
		}
	}
	final class amma extends nana
	{
		final void add()
		{
			System.out.println("amma");
		}
	}