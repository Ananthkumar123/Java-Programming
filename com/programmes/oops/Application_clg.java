package com.programmes.oops;
import java.util.Scanner;
public class Application_clg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      university u = new university();
//      u.university();
      collage c =new collage();
      c.collage();
		pg g = new pg();
		g.mtech();
	}

}
class university
{
	void university()
	{	
	Scanner sc =new Scanner(System.in);
	System.out.println("are u Pass 12th  press '1' ");
	int n = sc.nextInt();
	System.out.println("Welcome to parul unoversity");
	
	}	
}
class collage extends university
{
	void collage()
	{  
		
		Scanner sc =new Scanner(System.in);
		System.out.println("we offer degrees \n 1.UG AND \n2.PG");
		System.out.println("press 1 or 2 ");
		int n = sc.nextInt();
		if(n==1)
			System.out.println("u choose UG programme ");
		else
			System.out.println("u choose PG programme ");
	}
}
 class ug
 {
	 void branch()
	 {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("course we offer \n1.cse \n2.ece \n3.mech ");
		 System.out.println( "press the number , choose course u want ");
		 int n = sc.nextInt();
		 if(n==1)
			 System.out.println(" u choose cse with fees of 90k");
		 else if (n==2)
			 System.out.println("u choose ece with fees of 90k");
		 else 
			 System.out.println("u choose mech ");
	 }
 }
 class pg 
 {
	 void branch(int x)
	 {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("course we offer for pg  is \n1.MSC AND\n2. MTECH ");
		 System.out.println("enter a number ");
		 int n = sc.nextInt();
		 if(n==1)
			 System.out.println("u choose MSC");
		 else if (n==2 )
		
			 System.out.println("u choose Mtech");	
		      
	 }
	 void msc()
	 { 
		  this.branch(10);
		 Scanner sc =new Scanner(System.in);
		 System.out.println("msc course are \n1.maths \n2.physucs \n3.science");
		 System.out.println("enter a number");
		 int n = sc.nextInt();
		 if(n==1)
			 System.out.println("u choose maths");
		 else if (n==2 )
			 System.out.println("u choose Physics");
		 else
			 System.out.println("u choose chemistry");
		 
	 }
	 void mtech()
	 {
		 this.branch(10);
		 Scanner sc =new Scanner(System.in);
		 System.out.println("mtech course are \n1.cse \n2.computers \n3.meche");
		 System.out.println("enter a number");
		 int n = sc.nextInt();
		 if(n==1)
			 System.out.println("u choose msces");
		 else if (n==2 )
			 System.out.println("u choose computers");
		 else
			 System.out.println("u choose mech");
	 }
 }
 
