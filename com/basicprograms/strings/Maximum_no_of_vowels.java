package com.basicprograms.strings;

public class Maximum_no_of_vowels {

	public static void main(String[] args) {
		// print maximum no of voewsl
		
		String s ="coding hubd institue hub";
		String s2[]=s.split(" ");
		int s3[] = new int[s2.length];
		 
		System.out.println();
		int max=0;
		 
		for(int x=0;x<s2.length;x++)
		{   
			int count=0;
			//s2[x].charAt(x);
			for(int y=0;y<s2[x].length();y++)
			{
				if('a'==s2[x].charAt(y)||'A'==s2[x].charAt(y) ||'e'==s2[x].charAt(y)||'E'==s2[x].charAt(y)||'i'==s2[x].charAt(y)||'I'==s2[x].charAt(y)||'o'==s2[x].charAt(y)||'O'==s2[x].charAt(y)||'u'==s2[x].charAt(y)||'U' ==s2[x].charAt(y))
				 {
					count++;
					s3[x]=count;
				 }
				
			}
			 
			if(max<count)
			{
				max=count;
				
			}
			
		}
		for(int b=0;b<s3.length;b++)
		{
			if(s3[b]==max)
				System.out.println(s2[b]+" "+max);
		}
		
		 //System.out.println(max);
	}
	}


