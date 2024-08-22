package com.basicprograms.Threds1;

public class Priority01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sample s = new sample ();
		Thread t1 = new Thread(s,"anath");
		Thread t2 = new Thread(s,"comrade");
		t1.start();
		t2.start();
		t1.setPriority(10);
		 t2.setPriority(7);

	}

}
class sample implements Runnable 
{
	int count=0 ;
	
	public void run()
	{
		m1();
		
	}
	public  void m1()
		{
		for(int x =1;x<=10;x++)
		{
			count++;
			System.out.println(Thread.currentThread().getName()+"  "+count);
			
		}
		}
	
}