
import java .util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java .util.Random;
public class Main {
	
	public static void main(String args[])
	{ 
		String c ="hh1l3o1ool"; //  hh lll o
		String s ="";
		int count=0;
		for(int x=0;x<c.length();x++)
		{
			char d=c.charAt(x) ;
			if(Character.isAlphabetic(d))
			{
				if(c.indexOf(d)!=c.lastIndexOf(d))
				{
					if(s.indexOf(d)==-1)
					{
                           s += d;
                           count++;
                            
						}
					}
				}
			else
			{
				if(Character.isDigit(d))
				{
					int n = Character.getNumericValue(d);
					System.out.println(n);
				}
				
			}
			}
		System.out.println(s);
		}
	  
	}


  