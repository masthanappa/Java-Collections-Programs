package com.kn.collectoncomplexsorting;

import java.util.ArrayList;
import java.util.Collections;

import com.kn.collections3.Student;

public class ComplexSortingDemo {

	public static void main(String[] args) {
		Student s1 = new Student(11,"manu",73.5);
		Student s2 = new Student(22,"somu",43.5);
		Student s3 = new Student(33,"giri",83.5);
		Student s4 = new Student(44,"senu",90.5);
		
		
//		String str= new String("Dummy String");
//		System.out.println(str.toString());
//		System.out.println(s1);
//		System.out.println(str.toString());
//		System.out.println(s3);
		
		ArrayList<Student> stList = new ArrayList<Student>();
		stList.add(s1);
		stList.add(s2);
		stList.add(s3);
		stList.add(s4);
		
		
		System.out.println(" before sorting ");
		 System.out.println(stList);
//		Collections.sort(list); complex object cant be sort this way
//		 Collections.sort(stList);

		System.out.println(" affter sorting ");

		System.out.println(stList);
	}
	}


