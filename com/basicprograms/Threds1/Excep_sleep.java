package com.basicprograms.Threds1;

public class Excep_sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		exp e = new exp();
		Thread t1 = new Thread(e,"ananth");
		  for(int x =0;x<10;x++)
		  {
			  System.out.println(Thread.currentThread().getName());
			  t1.start();
			  t1.interrupt();
		  }
		
	}

}

class exp implements Runnable
{
	public void run() 
	{
		try {
			Thread.currentThread().sleep(1000);
		 
		  }
		catch(Exception e) {
			
		}
	}
}