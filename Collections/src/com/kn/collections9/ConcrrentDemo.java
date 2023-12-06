package com.kn.collections9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcrrentDemo {

	public static void main(String[] args) {
		CopyOnWriteArrayList list = new CopyOnWriteArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		int temp=40;
//		//Concrrent Modification  with for loop ===> infinite loop
//		for(int i=0; i<list.size()-1;i++) {
//			System.out.println(list.get(i));
//			list.add(temp);
//			temp+=10;
			
//			//Concurrent Modification  with for-each loop ===> Concurrent ModificationException 
			/*for(Object i: list) {
				System.Concrrent Modification "p[o[out.println();
		
				list.add(temp+=10);
				
				*/
				Iterator itr = list.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next()+" ");
					list.add(temp+=10);
				}
			}
		}
		
		
		
	


