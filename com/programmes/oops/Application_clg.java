package com.programmes.oops;
import java.util.Scanner;
public class Application_clg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      university u = new university();
//      u.university();
//      collage c =new collage();
//      c.collage();
		pg g = new pg();
		g.msc();
		
//		ug cg = new ug();
//		cg.branch();
//		
	}

}
class university
{
	int n ;
	void university(int x)
	{	
	Scanner sc =new Scanner(System.in);
	System.out.println("are u Pass 12th  press '1' ");
	n = sc.nextInt();
	if(n==1)
	System.out.println("Welcome to parul unoversity");
	 

	 }	
	
}
class collage extends university
{
	void collage(int y)
	{  
		this.university(10);
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
 class ug extends collage
 {
	 void branch()
	 {
		 this.collage(10);
		 if(n==1) 
		 {
		   Scanner sc =new Scanner(System.in);
		   System.out.println("course we offer \n1.cse \n2.ece \n3.mech ");
		   System.out.println( "press the number , choose course u want ");
		   int n = sc.nextInt();
		   int csef =150000,ecef =100000,meachf=100000,fees=0;
		 
		   if(n==1)
		   {
			 System.out.println(" u choose CSE  with ML");
		    System.out.println("u choose CSE and "+csef);
		    fees = csef;
		    }
		    else if (n==2)
		    { System.out.println("u choose ECE with EMMBED SYSTEMS ");
		     System.out.println(" ECE fees is"+ecef);
		     fees = ecef;
		    }
		    else if(n==3)
		    { System.out.println("u choose MEACHANICAL  WITH MEACHNES");
		      System.out.println(" MEACHNICAL fees is"+meachf);
		      fees=meachf;
		     }
		 else
		 {
			 System.out.println("invalid input");
		 }
        
		   System.out.println("\n For discount enter ur EMCET RANK");
        int rank= sc.nextInt();
        int a=5 ,b=10,c=20,d=30 , finalfees=0;
        
        if(rank >100000) 
        {
        	System.out.println("ur discount is "+a+"%");
        	System.out.println(fees);
        	finalfees = fees-(fees*a)/100;	
        	System.out.println("ur fianl fees is "+finalfees);
        }
        else if(rank >=10000)//40000
        {
        	System.out.println("ur discount is "+b+"%");
        	finalfees = fees - (fees*b)/100;
        	System.out.println("ur fianl fees is "+finalfees);
        }
        else if(rank>=1500)
        {
        	System.out.println("ur discount is "+c+"%");
        finalfees = fees - (fees*c)/100;
        System.out.println("ur fianl fees is "+finalfees);
        }
        else if(rank >=100) {
        	System.out.println("ur dicount is "+d+"%");
        finalfees = fees - (fees*d)/100;
        System.out.println("ur fianl fees is "+finalfees);
        }
        
		 }
		 else {
			 System.out.println("ur fail cant procced");
		 }
        
	 }
 }
 class pg extends university
 {
	 
	 void branch(int x)
	 { 
		 
		 super.university(10);
		 if(n==1)
		 {
			 Scanner sc =new Scanner(System.in);
			 System.out.println("course we offer for pg  is \n1.MSC AND\n2. MTECH ");
			 System.out.println("enter a number ");
		 
			 int  n = sc.nextInt();
			 if(n==1)
		 
			 System.out.println("u choose MSC");
		
			 else if (n==2 )
		
			 System.out.println("u choose Mtech");
			
			 }
		 else
			 System.out.println("invalid input");
	 }
	 void msc()
	 { 
		  this.branch(10);
		 Scanner sc =new Scanner(System.in);
		 System.out.println("msc course are \n1.maths \n2.physucs \n3.science");
		 System.out.println("enter a number");
		 int n = sc.nextInt();
		 int fees =70000;
		 if(n==1)
			 {
			 System.out.println("u choose maths");
		    System.out.println("msc maths fees is "+fees);
			 }
		 else if (n==2 )
			 {
			 System.out.println("u choose Physics");
			 System.out.println("msc physics fees is "+fees);
			 }
		 else if (n==3)
		 {
			 System.out.println("u choose chemistry");
			 System.out.println("msc chemistry fees is "+fees);

		 }
		 
		 System.out.println("for scolrship");
		 System.out.println("\nenter ur scholrship rank");
		 
		 int scolr=sc.nextInt();
		  int a=5 ,b=10,c=20,finalfees=0; 
		 if(scolr>10000)
		 {
			 System.out.println("ur applicable schoolrship is "+a+"%");
			 finalfees= fees- (fees*a)/100;
			 System.out.println("fianal fees is "+finalfees);
			 
		 }
		 else if(scolr>=1000)
		 {
			 System.out.println("ur applicable schoolrship is "+b+"%");
			 finalfees= fees- (fees*b)/100;
			 System.out.println("fianal fees is "+finalfees);
		 }
		 else if(scolr>=100)
		 {
			 System.out.println("ur applicable schoolrship is "+c+"%");
			 finalfees= fees- (fees*c)/100;
			 System.out.println("fianal fees is "+finalfees);
		 }
		 
		 
		 
		 
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
 
