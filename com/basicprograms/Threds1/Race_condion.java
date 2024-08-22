package com.basicprograms.Threds1;

public class Race_condion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		simple s = new simple ();
		Thread t1 = new Thread(s,"anath");
		Thread t2 = new Thread(s,"comrade");
		t1.start();
		t2.start();
		 

	}

}
class simple implements Runnable 
{
	int count=1 ;
	
	public void run()
	{
		m1();
		
	}
	public  synchronized void m1()
		{
		for(int x =1;x<=10;x++)
		{
			System.out.println(Thread.currentThread().getName()+"  "+count);
			count++;
			
		}
		}
	
}