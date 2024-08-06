package com.basicprograms.exeptions;

import java.io.IOException;
import java.sql.SQLException;

public class Throh_and_thros {

	public static void main(String[] args) throws IOException,SQLException
	 {
		int a =100, b=11;
		 if(a>b)
		 {
			// System.out.println("it is checked expression");
			 try {
			 throw new IOException();//system
			 }
			 catch(IOException q) {
				 System.out.println("it is io exception");
			 }
		 }
		 else if(a<b) 
		 {
			 
		 }
	}
	 

		


}
