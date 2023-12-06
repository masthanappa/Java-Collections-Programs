package com.kn.collections8;


import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;



public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
			LinkedHashMap map1 = new LinkedHashMap<>();
			map1.put(1, 900);
			map1.put("Two",new Student(1,"Mahesh",7.9));
			map1.put(3, 700);
			map1.put("Three",new Student(1,"Manu",7.9));
			map1.put(5, 400);
			map1.put(6, "6666");
			System.out.println(map1);
			
			//Accessing only key-values pair using entrySet() method which returns a set object
			Set kv=map1.entrySet();
			System.out.println("Key-Values="+kv);
			//Accessing only values pair using values() method which returns Collection object
			Collection values = map1.values();
			System.out.println("Values="+values);
		}

	}


