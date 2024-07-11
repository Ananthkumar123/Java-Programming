package com.basicprograms.arrays;

public class Even_indexSwapping {

	public static void main(String[] args) {
		 
		int a[] =new int[] {10,20,30,40,50,60};
		  int blen=0;
		  int clen=0;
		  for(int x=0;x<a.length;x++)
		  {
			  if(x%2==0)
				  blen++;
			  else
				  clen++;
		  }
		  int b[] =new int[blen];
		  int c[] = new int [clen];
		  int d[] = new int[a.length];
		  for(int x=0,y=0,z=0;x<a.length;x++)
		  {
			  if(x%2==0)
			  {
				  b[z]=a[x];
				  z++;
			  }
			  else 
			  {
				  c[y]=a[x];
				  y++;
			  }
		  }
		  for(int t :b)
			  System.out.print(t+",");
		  System.out.println();
		  for(int t :c)
			  System.out.print(t+",");
		  
		  System.out.println("\n d array");
		  
		  for(int x=0,y=c.length-1;x<a.length;x++) //0,1,2 3
		  {
			  if(x<blen)//0<3,1<3,2<3
			  {
				  d[x]=b[x];//d[0]=10,d[1]=30,d[2]=50
			  		 //1,
			  }
			   else //0<3
			   { 			 
			  	 d[x]=c[y];
			  	 y--;
				   
			    }
					  
			 }
		  for(int t :d)
			  System.out.print(t+",");
		  
	}

}
