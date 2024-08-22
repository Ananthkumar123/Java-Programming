package com.basicprograms.strings;

public class Hello_olleH {
 //op = hagm
	public static void main(String[] args) {
		 
		String s ="virtual information revalution solu";
		String ar[]=s.split(" ");
		String s2="";
		for(int x=0;x<ar.length;x++)
		{
			char c = ar[x].charAt(0);
			s2=s2+c+" ";
		}
		System.out.println(s2);
		System.out.println();
		
		String c ="hello all good morning"; //morning good all hello
		
		char ch[] = c.toCharArray();
		
		for(int x=ch.length-1;x>=0;x--)
		 
		{
			//char d =ch[x];//array
	
			System.out.print(ch[x]);
		}
		 
		System.out.println();
		
		// op=ollh lla doog gninrom
		//reversing the word 
		//op = gninrom doog lla olleh
		String a ="hello all good morning";
		String ar1[]=a.split(" ");
		String b="";
		for(int x=0;x<ar1.length;x++)
		{
			String temp=ar1[x];//
			StringBuffer sb =new StringBuffer(temp);
			sb.reverse();
			
			b=sb.toString();
			System.out.print(b+" "+"");
		}
		System.out.println();
		
		String z ="hello all good morning"; //morning good all hello
		 
		String y[]= c.split(" ");
	  for(int x =y.length-1;x>=0;x--)
	  {
		  String c2 =y[x].toString();
				  
		  System.out.print (c2+" ");
	  }
		
		  
		
	}

}
