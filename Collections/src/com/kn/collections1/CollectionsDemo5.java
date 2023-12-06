package com.kn.collections1;

import java.util.PriorityQueue;

public class CollectionsDemo5 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(50);
		pq.add(40);
		pq.add(30);
		pq.add(20);
		pq.add(10);
		pq.add(6);
		//pq.add("Ten"); Generate compile time error due to type safety
		PriorityQueue<String> pq2 = new PriorityQueue<String>();
		pq2.add("Ten");
		pq2.add("Twenty");
		pq2.add("Thirty");
		//pq.add(10); Generate compile time error due to type safety


		System.out.println(pq); 
		System.out.println(pq2); 
		
	}

}
