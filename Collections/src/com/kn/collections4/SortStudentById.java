package com.kn.collections4;

import java.util.Comparator;

import com.kn.collectoncomplexsorting.Student;

public class SortStudentById implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getId() > s2.getId()) {
			return 1;
		}else if (s1.getId()  < s2.getId()) {
			return -1;
		}else {
		return 0;
		}


//	public int compare(Student s1, Student s2) {
//			if(s1.id > s2.id) {
//				return 1;
//			}else if (s1.id  <s2.id) {
//				return -1;
//			}else {
//			return 0;

			}
	}
	

