package com.basicprograms.arrays;
import java.util.Arrays;
import java.util.Random;
public class SecondmaxSecondndmin {

	public static void main(String[] args) {
		  
		 Random r= new Random();
		 int a[] = new int[5];
		 
		int max=Integer.MIN_VALUE ,min=Integer.MAX_VALUE;
		int Smax=Integer.MIN_VALUE ,Smin=Integer.MAX_VALUE;
		
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=r.nextInt(1,100);
			System.out.print(a[x]+",");
		}
		System.out.println( );
		Arrays.sort(a);
		for(int t:a)
			System.out.print(t+" ");
		for(int x=0;x<=a.length-1;x++)
		{	
			
			
			if(max<a[x]) //0<10,10<50,
			{  
				Smax=max; //0 10
				max=a[x];//10,50
			}
			else if(Smax<a[x] && Smax<max)//0<10 && 0<10, 10<50 && 10<50
			{
				Smax =a[x]; //10,,50,
			}
		}
		 System.out.println("\n "+max);
		 System.out.println("Second maximum is "+Smax);
		 
		 for(int x=0;x<=a.length-1;x++)
			{		 
				if(min>a[x]) // maximum value> 10, 10>50f, 10>8,8>9,25
				{   Smin=min; // maximum ,10
					min=a[x];//10,8
				}
				else if(Smin>a[x] && Smin>min)// maxval>10 && maxva >10, 10>50,10>8&& 10>8
				{
					Smin =a[x]; //10,8
				}
			}
			 System.out.println(min);
			 System.out.println("Second minimum is "+Smin);
		 
	}

}
