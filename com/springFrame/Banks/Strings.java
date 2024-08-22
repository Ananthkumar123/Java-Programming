package com.springFrame.Banks;

public class Strings {

	
//	sbi s =new sbi();
//	icici i = new icici();
//	Andhra a = new Andhra();
	
	Rbi_interf R =new icici();
	Rbi_interf r = new sbi();
	
	public Strings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void cal()
	{
		System.out.println(R.balance()+" this is icici"); 
		System.out.println(r.Balance()+" this is sbi");
	 
	}
	
}
