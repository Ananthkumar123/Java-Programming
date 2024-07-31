package com.programmes.oops;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent1 Child = new child1(); //in heriting or upcast(prefer inheritence) //new class must be 
		Child .sub();
		Child.add();
		Child.div();
//	    Child.mul();
		System.out.println(Child.num());
   
	}

}
abstract class parent1
{
	void add()
	{
		System.out.println("abstract");
	}
	abstract void sub();
	abstract void div();//un implimented methods 
	//abstract void mul();
	abstract  String num();
}
 class child1 extends parent1
{
  void sub() //extending to the impliment 
  {
	  System.out.println(" updated to implimented method ");
  }
  void div()
  {
	  System.out.println("updated to implimented method  div");
  }
  String num() {
	  return "this is 100";
  }
  
  
}
//class me extends child1
//{
//	  void mul()
//	  {
//	  System.out.println("updated to implimented method  mul");
//	  }
//}