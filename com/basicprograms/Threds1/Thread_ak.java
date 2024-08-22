package com.basicprograms.Threds1;

 
public class Thread_ak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		ak t1 =new ak();
//		 ak t2 = new ak();
//		 t1.setName( "ananth");
//		 t2.setName( "comrade");
//		 t1.start();
//		 t2.start();
		
//		pk t1 =new pk();
//		
//		Thread tread = new Thread(t1,"ananth");
//		tread.start();
//		Thread tread1 = new Thread(t1,"comrade");
//		tread1.start();
		
		
		Runnable r=()->
		{
			for(int x =0;x<=9;x++)
				System.out.println("iam tread1");
			
		};
		

	}

}
//class ak extends Thread
//{
//	public void run()//predefind method
//	{
//		for(int x=0;x<=10;x++)
//		{
//			System.out.println(Thread.currentThread().getName());
//		}
//	}
//}
 //without tread class 

class pk implements Runnable
{

	@Override
	public void run() {
		 
//		for(int x=0;x<=10;x++)
//			{
//				System.out.println(Thread.currentThread().getName());
//			}
		
	}

	 
	
}
