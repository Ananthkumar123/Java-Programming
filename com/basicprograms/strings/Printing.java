package com.basicprograms.strings;

public class Printing {

	public static void main(String[] args) {
		//a2b5c6
		String s="a12b5c6";
		int z=0;
		for(int x=0;x<s.length();x++)
		{
			if(x<z)
				continue;
			else
			{
				
			
			char c=s.charAt(x);//a,1
			if(Character.isDigit(c))//1
			{
				char d= s.charAt(x-1);//a
				int e =Character.getNumericValue(c);//1
				
				for( z=x+1;z<s.length()&&Character.isDigit(s.charAt(z));z++)//1+1=2=1;
				{
				   e=e*10+Character.getNumericValue(s.charAt(z));//1*10+2=12
					
				}
			
				//System.out.println(e);
				for(int y=0;y<e;y++)
				 {
				 System.out.print(d+" ");
				 }
				
		    }
		}
		
	}
		
	}
	}
