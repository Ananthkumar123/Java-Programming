package com.basicprograms.loops;
//largest digit in a number
public class largestnumber {

	public static void main(String[] args) {
		int num =765915,max=0;
		for(;num>0;num/=10)
		{
			int rem =num%10;
			  if(rem>max)//2>1 ,5>2
			  {
				  max =rem;//1,2,5
				//System.out.println("largest"+max);
			  }
			 
		}
		System.out.println(max+" largest ");
	}
	
	

}
