package com.kn.collections4;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	
		int id;
	    String name;
	    double Percentage;
	    
	    public Student(int id, String name, double percentage) {
	   	 this.id=id;
	   	 this.name=name;
	   	 this.Percentage=percentage;
	    }

		
		public int getId() {
			return id;
		}

		
		public void setId(int id) {
			this.id = id;
		}

		
		public String getName() {
			return name;
		}

			public void setName(String name) {
			this.name = name;
		}

		
		public double getPercentage() {
			return Percentage;
		}

			public void setPercentage(double percentage) {
			Percentage = percentage;
		}


			@Override
			public String toString() {
				return "Student [id=" + id + ", name=" + name + ", Percentage=" + Percentage +
					 "]";
			}


//			@Override
//			public int compareTo(Object o) {
//				if(this.id>((student)(o)).id) {
//					return 1;
//				}else if (this.id<((student)(o).id)) {
//					return -1;
//				}else {
//				return 0;
//			}
	    
//			}
//			public int compareTo(Student s) {
//				if(s1.id>s2.id) {
//					return 1;
//				}else if (s1.id<s2.id) {
//					return -1;
//				}else {
//				return 0;
//
//			}

//			}
//
//			Collections.sort(studentList,new  Comparator<Student>() {
//				punlic int compare(Student s1, Student s2) {
//					return s1.getName().ComparaTo(s2.getName());
//				}
//			});

			@Override
			public int compare(Student s1, Student s2) {
				if(s1.id > s2.id) {
					return 1;
				}else if (s1.id<s2.id) {
					return -1;
				}else {
				return 0;

				
			}}
	}
		
		



