package com.kn.collections1;

import java.util.LinkedList;

public class CollectionDemo3 {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(1,11);
		list1.add(1,22);
		list1.add(10);
		
		LinkedList list2 = new LinkedList();
		list1.add("one");
		list1.add("Two");
		list1.add("Three");
		
		System.out.println(list1);
		System.out.println(list2);
		
//		System.out.println(list1.get(2));
//		System.out.println("indexof(10)="+list1.indexOf(10));
//		System.out.println("lastIndexof(10)="+list1.lastIndexOf(10));
	}

}
