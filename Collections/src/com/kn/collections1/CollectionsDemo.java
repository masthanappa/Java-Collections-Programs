package com.kn.collections1;

import java.util.ArrayList;

public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(100);
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(true);
		list1.add("ten");
		list1.add('a');
		list1.add(111);
		
		System.out.println(list1);
		System.out.println(list1.size());
}

}
