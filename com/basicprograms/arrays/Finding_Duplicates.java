package com.basicprograms.arrays;

public class Finding_Duplicates {

	public static void main(String[] args) {
		int a[]=new int[] {2,2,25,24};
		int count=0,x=0,k=0;
		
		for(int i=0;i<a.length;i++)
		{
			 count=0;
			for(int j=0;j<a.length;j++) 
			{
				if(a[i]==a[j]) 
				{
					count++;
				}	
			}
			if(x<count) 
			{
				x=count;
				k=i;
			}
		}	
		if(x>1)
		{
			System.out.println(a[k]+" is repeating "+x+" times");
		}
		else 
		{
			 
			System.out.println("no dupliate values");
		}
		

	}

}
