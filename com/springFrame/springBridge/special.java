package com.springFrame.springBridge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class special {

	int num  ;
	public special(int num, String type, int[] a, List<Integer> li, Student s1) {
		super();
		this.num = num;
		this.type = type;
		this.a = a;
		this.li = li;
		this.s1 = s1;
	}
	String type;
	int a[];
	List<Integer> li=new ArrayList<>();
	Student s1;
	@Override
	public String toString() {
		return "special [num=" + num + ", type=" + type + ", a=" + Arrays.toString(a) + ", li=" + li + ", s1=" + s1
				+ "]";
	}
	
	 		 
	

}
