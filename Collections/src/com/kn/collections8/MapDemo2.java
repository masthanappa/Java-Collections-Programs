package com.kn.collections8;

import java.util.HashMap;

import com.kn.collections3.Student;

public class MapDemo2 {

	public static void main(String[] args) {
		HashMap map1 = new HashMap<>();
		map1.put(1, 900);
		map1.put("Two",new Student(1,"Mahesh",7.9));
		map1.put(3, 700);
		map1.put("Three",102);
		map1.put(5, 400);
		map1.put(6, "300");
		System.out.println(map1);

	}

	}


