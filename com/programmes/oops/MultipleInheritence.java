package com.programmes.oops;

public class MultipleInheritence {

	public static void main(String[] args)
	{
		ananth ak = new ananth();
		ak.future("btech ","pap s ");
		//ak.narasaih();
		yamu ya = new yamu();
		ya.yamu();
		ya.future("para ","pap s");
		
		
	}

}
class papa
{
	String land = "3acres";
	int house = 1;
	 
	void narasaih()
	{
		System.out.println("me have land of "+land+"\n house is "+house);
	}
}
class ananth extends papa
{
	 
	void future( String designation,String property)
	{
		 
		System.out.println("hey i completed "+designation +" ,properties "+property);
	}
}
class yamu extends ananth{
	int rent =1000;
	void yamu()
	{
		System.out.println("i have share ");
	}
	

}
