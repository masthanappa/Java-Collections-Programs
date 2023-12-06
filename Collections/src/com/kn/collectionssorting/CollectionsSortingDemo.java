package com.kn.collectionssorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionsSortingDemo {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		set.add(35);
		set.add(74);
		set.add(8);
		set.add(725);
		System.out.println("Using Treeset "+set);
		
		
		ArrayList<Integer> list = new ArrayList<>();
		list .add(756);
		list .add(39);
		list .add(61);
		list .add(28);
		System.out.println("list before sorting "+list);
		 
		Collections.sort(list);
		System.out.println("List affter sorting "+list);

	}

}
