package com.springFrame.springBridge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

	 int roll ;
	 public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
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
	String name;
	 @Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", section=" + section + "]";
	}
	String section;
        
     
      
	

}
