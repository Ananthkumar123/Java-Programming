package com.programmes.Collections;

import java.util.ArrayList;
import java.util.List;

public class Methods {

	public static void main(String[] args) {
		 
		List<ananth> a = new ArrayList<>();
		a.add( new ananth ());
		
		
		 
	}
}
 
class ananth
{
	int num ;
	String name;
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "ananth [num=" + num + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	
	  
}