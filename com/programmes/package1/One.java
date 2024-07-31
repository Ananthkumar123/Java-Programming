package com.programmes.package1;

public class One 
{
	public static void main(String args[])
	{
		
	}	
	
	 public void  m1() 
	 {
		 System.out.println("this is m1");
	 }
	 protected void m2()
	 {
		 System.out.println("this is m2 protected");
	 }
	 private void m3()
	 {
		 System.out.println("this is m3");
	 }
	 
	 private String name,section;
	 private int roll,percentage;
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "One [name=" + name + ", section=" + section + ", roll=" + roll + ", percentage=" + percentage
				+ ", getName()=" + getName() + ", getSection()=" + getSection() + ", getRoll()=" + getRoll()
				+ ", getPercentage()=" + getPercentage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	 
	  
	 }
	 
	



