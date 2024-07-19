package com.basicprograms.strings;

public class Practise {
	 
	public static void main(String args[]) {
		
		String  s="hello ananthkumar institue";
		String a[]=s.split(" ");
		int  s1[]=new int[a.length];
		int max=0;
		for(int x=0;x<a.length;x++)//hello
		{ 
			int count=0;
			for(int y=0;y<a[x].length();y++)//h;h<4;e<4
			{
				if('a'==a[x].charAt(y)||'e'==a[x].charAt(y)||'i'==a[x].charAt(y)||'o'==a[x].charAt(y)||'u'==a[x].charAt(y))
				{
					count++;//2
					s1[x]=count;
				}
			}
			if(max<count)//0<1 1<2
				max=count;
		}
		for(int b=0;b<s1.length;b++)
		{
			if(s1[b]==max)
				System.out.println(a[b]+" "+max);
		}
		 
	}

}
