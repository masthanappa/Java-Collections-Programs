package com.kn.collections1;

import java.util.ArrayDeque;

public class CollectionsDemo4 {

	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		
		ad.add(10); 
		ad.add(20.5); 
		ad.add("Thirty");
		ad.add(true);
		
		System.out.println("First="+ad.getFirst() );
		System.out.println("Last="+ad.getLast());
		
		ad.addFirst(111);
		ad.addLast(999);
		
		System.out.println("First="+ad.getFirst() );
		System.out.println("Last="+ad.getLast());
		System.out.println(ad);
		

	}

}
