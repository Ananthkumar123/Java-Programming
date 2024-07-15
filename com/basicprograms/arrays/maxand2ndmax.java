package com.basicprograms.arrays;

public class maxand2ndmax {

	public static void main(String[] args) {
		  int a[]= {1,5,8,70,4,90};
		 
		  int max =Integer.MIN_VALUE ,  smax=Integer.MIN_VALUE;
		  for(int x=0;x<=a.length-1;x++)
		  {
			  if(max<a[x])//0<1
			  {
				  max=a[x];//1,
				  
			  }
		  }
		  System.out.println("max value is "+max);
		  
		 for(int y=0;y<=a.length-1;y++)
		 {
			 if(smax<a[y] && max>a[y])//0<70 && 
			  {
				  smax =a[y];
			  }
		 }
		 System.out.println("2ndmax value is "+smax);
		  
	}

}
