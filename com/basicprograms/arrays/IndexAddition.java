package com.basicprograms.arrays;

public class IndexAddition {

	public static void main(String[] args) {
		
		 int a[]= {1,5,9,10,7};
		 int b[]= new int[a.length];
		 
		 for(int x=0;x<=a.length-1;x++)
		 {
			 if ( x==0)//first element 
			  {
				 b[x]= a[x]+a[x+1];
			  }
			 else if(x==a.length-1) //
				 b[x]=a[x-1]+a[x];
			 else
				 b[x]=a[x-1]+a[x+1];
			  
		 }
		  System.out.println();
		 for(int y=0;y<=b.length-1;y++)//for(temp:b)
		 {                              //
			 System.out.println(b[y]); //System.out.println(temp);
		 }
		 

	}

}
