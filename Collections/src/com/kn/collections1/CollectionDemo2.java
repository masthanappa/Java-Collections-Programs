package com.kn.collections1;

import java.util.ArrayList;

public class CollectionDemo2 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		ArrayList list2 = new ArrayList();
		list2.add("one");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		list2.add("Five");
		
		
		System.out.println(list1);
		System.out.println("**************************");
		System.out.println(list2);
		System.out.println("***********************************");
		
		//list.addAll(list1); //add all elements of specified collection at the end
		list2.addAll(2, list1);
		//add all elements of specified collection at the specified index
		System.out.println(list2);
	}

}
