package com.basicprograms.exeptions;

import java.io.File;
import java.io.IOException;


import java.util.*;
public class File_creation {
 		
		 public static void main(String args[])
		 {
		   File  f=new File ("C:\\Users\\anant\\Desktop\\exception.txt");
		   try{
			if(f.createNewFile()) //pre
			{
			  System.out.println("file created succesfully");
			}
		  	 else
			{
			  System.out.println("file not created ");
			}
		      }
		  catch(IOException a)
			{   System.out.println("file intreputeddue to exception");
			}	

	}

}
