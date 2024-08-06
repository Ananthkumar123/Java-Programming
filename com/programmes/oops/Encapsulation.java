package com.programmes.oops;

public class Encapsulation {

	public static void main(String[] args) {
    
	Encapsulation e =new Encapsulation();
	e.setName("ananth");
	e.roll =2;
	e.setSection("A section");
	e.setSubjects("maths");
	System.out.println(e);
	
	}
	private String name, section,subjects;
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Encapsulation [name=" + name + ", section=" + section + ", subjects=" + subjects + ", roll=" + roll
				+ "]";
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
	public String getSubjects() {
		return subjects;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	private int roll;
	
}
