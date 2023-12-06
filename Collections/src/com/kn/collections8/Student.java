package com.kn.collections8;

public class Student {
	int id;
	String name;
	double cgpa;
	
	  public Student(int id, String name, double cgpa) {
		   	 this.id=id;
		   	 this.name=name;
		   	 this.cgpa=cgpa;
		    }

@Override
public String toString() {
	return "StudentDetails [id=" + id + ", name=" +cgpa + ", cgpa="   
			+ "]";
}

}
