package com.basicprograms.arrays;

public class UniqueDuplicateFrequency {

	public static void main(String[] args) {
		 
		int a[]= new int[] {10,8,25,60,10,4,10,25,8,6,10};
		int b[]= new int[a.length];
		
		for(int x=0;x<=a.length-1;x++)
		{  
			int count=1;
			if( b[x]==1)
			{
				continue;
			}
			for(int y=x+1;y<=a.length-1;y++)
			{
				 if(a[x]==a[y])
				 {
					 b[y]=1;
					 count++;
				 }
			}
			 
		//	 System.out.println(a[x]+"   "+count ); //frequncy
			 
		 if(count==1)
				System.out.println(a[x]+" unique");
			else 
				System.out.println(a[x]+" duplicate");
			
		}

	}

}
