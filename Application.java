// welcome store

import java.util.*;

public class Application {

	public static void main(String[] args) 
	{
		
		Scanner A = new Scanner(System.in);
		System.out.println("welcome to the store");
		System.out.println("your name: ");
		String name =A.next();
		System.out.println("your gender: male /  female");
		String gender =A.next();
		
		if(gender.equals("male")) {
	
			System.out.println("Welcome mr"+name);
		}
		else
			System.out.println("welcome mrs/miss"+name);
		
		System.out.println("avilable products are :1.pulasr\n 2.Hero\n 3.Bajaj\n " );
		do {
		char store;
		 int product,quantity, total=0,pprice= 112000,hprice=150000,bprice=20000;
		 
		 System.out.println("enter a number 1 to 3");
			product = A.nextInt();

		 
		 if (product==1) {
			 System.out.println("you chosse ferosius pulsar\n enter the quantity");
			 
			 quantity=A.nextInt();
			 total=total+(quantity*pprice);
			 }
		 
		 else if (product==2) {
			 System.out.println("you chosse hero\n enter the quantity");
			 quantity=A.nextInt();
			 total=total+(quantity*hprice);
		 }
		 else if (product==3) {
			 System.out.println("you chosse bajaj\n enter the quantity");
			 quantity= A.nextInt();
			 total=total+(quantity*bprice);
		 }
		 System.out.println("enter y to continue or enter n to exit");
		 store=A.next().charAt(0);
		
		 
		 if(store=='n' || store=='N') 
			 
		 {
			 System.out.println("total price is"+total+" thankyou ");
			 break;
			
		 }
		 }

		 while(true);
		 
		
		
	 
		

	}

}
