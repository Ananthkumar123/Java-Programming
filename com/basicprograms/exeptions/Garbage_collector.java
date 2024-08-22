package com.basicprograms.exeptions;

public class Garbage_collector {

	public static void main(String[] args) {
		 
		ananth a = new ananth();
		a=null;
		System.gc();
		System.out.println("deleting the obj a ");
		 
		  
	}

}
class ananth
{
	protected void finalize() {
		System.out.println("finalize works automatically");
	}
	
} 