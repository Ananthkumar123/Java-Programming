package com.basicprograms.arrays;

public class Insertion {

	public static void main(String[] args) {
		//insertion 
		
//		int a[] =new int[] {10,20,40,50,60,70,0};
//		
//		int index=3,element=65,x;
//		
//		for( x=a.length-1;x>index;x--)// right rotation
//		{
//			a[x]=a[x-1]; //
//		}
//		a[x]=element;//
//		
//		for(int t :a)
//			System.out.println(t);
//		System.out.println();
//		
//		//deletion
//		
//		int b[] =new int[] {10,20,30,40,50,60,70};//40,50,60,70,10,20,30   40,50,60,70,80,90, 10,20,30,
//		int y ,r=3;
//		
//		for( y=r;y<b.length-1;y++)//left rotation
//		{
//			b[y]=b[y+1];
//		}
//		b[b.length-1]=0;
//	      
//		for(int t :b)
//			System.out.print(t+","); // 10,0,20,30,40,50,60,
		
		//int c[] =new int[] {10,20,30,40,50,60,70};//, 40,50,60,70,10,20,30 
//		 int r=4;						
//	for(int t=0;t<r;t++)
//	{
//		int temp =c[0],z;
//		for( z=0;z<c.length-1;z++)//right rotation
//		{
//			c[z]=c[z+1];//
//		}
//		  c[z]=temp;
//		  
//		
//	}
//	for(int f :c)
//		System.out.print(f+",");  
//		System.out.println("-------");
		  
		int c[] =new int[] {10,20,30,40,50,60,70};
			int z,temp=c[c.length-1];
			
			for( z=c.length-1;z>0;z--)// left rotation//7,7>0,6
			{
				c[z]=c[z-1];//70=60,60=50,50=40...20=10,10=
			}
			c[0]=temp;
			  
		for(int f :c)
			System.out.print(f+",");
			System.out.println();
	}
}
