package com.basicprograms.arrays;

public class Finding_Duplicates {

	public static void main(String[] args) {
		int a[]=new int[] {2,25,80,24,90,80,25,2,80,80,90};
		 int b[]=new int[a.length];
		int count;
		 for(int x=0;x<a.length-1;x++)//0,1=25
		 {
			  count =1;
			 if(b[x]==1)
				 continue;
			 for(int y=x+1;y<a.length;y++)
			 {
				 if(a[x]==a[y])//2,25//2 2,25==80
				 {
					 count++;//2(1)80(1,2,3)
					 b[y]=1;
					 
				 }
			 }
			 if(count>1)
				 System.out.println(a[x]+"  count is"+count); //2(1)
			  
		 }

	}

}
