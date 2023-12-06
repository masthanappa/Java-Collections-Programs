package com.kn.collections7;

import java.util.TreeMap;

import com.kn.collections3.Student;

public class MapDemo1 {

	public static void main(String[] args) {
			TreeMap map1 = new TreeMap<>();
			map1.put(1, 900);
			map1.put(2, new Student(1,"Aksh",8.2));
			map1.put(3, 700);
			map1.put("four", new Student(2,"Pradeep",7.2));
			map1.put(5, 400);
			map1.put(6, 300);
			System.out.println(map1);

		}

	}


