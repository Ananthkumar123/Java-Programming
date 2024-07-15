package com.basicprograms.arrays;

public class Boble_sort {

	public static void main(String[] args) {
		 //boble sort

		int a[]= {60,50,48,90,10};
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a.length-1-x;y++) //-x = reduce the itterations and .-1 is comparing the elemts  
			{//50,60,48,90,10
				if(a[y]>a[y+1])//60>50,60>48,60>90,90
				{
					int t =a[y];//t=60,60,
					a[y] =a[y+1];//a[y] =50,60
					a[y+1] =t;//a[y+1] =60,48,
					
				}
			}	
			
		}
		for(int t:a)
			System.out.print(t+",");
	}

}
