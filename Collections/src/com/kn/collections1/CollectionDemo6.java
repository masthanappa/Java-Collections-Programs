package com.kn.collections1;

import java.util.TreeSet;

public class CollectionDemo6 {

	public static void main(String[] args) {
		 
		TreeSet set = new TreeSet();
		set.add(10);
		set.add(20);		
		set.add(30);
		set.add(1);
		// set.add(1.5);// Heterogeneous not Allowed
		
		// Duplicated Element Not Allowed 
		set.add(20);
		set.add(20);
		set.add(20);
		set.add(20);
		
		System.out.println(set);
	}

}
