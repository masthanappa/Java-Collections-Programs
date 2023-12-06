package com.kn.collections5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
//import com.kn.collections4.Student;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(11,"Ram",45555);
		Employee e2=new Employee(22,"Manu",32555);
		Employee e3=new Employee(33,"Giri",50555);
		Employee e4=new Employee(44,"Somu",30555);
		
		ArrayList<Employee> lst =new ArrayList<Employee>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);
		
		System.out.println("Before Sorting ===========>");
		System.out.println(lst);
		System.out.println("**************************************");
		
		
		Collections.sort(lst, new Comparator<Employee>() {
			
		
			public int compare(Employee s1, Employee s2) {
				if(s1.empId > s2.empId) {
					return 1;
				}else if (s1.empId<s2.empId) {
					return -1;
				}else {
				return 0;	
		}}
		});
		System.out.println("Affter ID Sorting ascending Order ===========>");
		System.out.println(lst);
		System.out.println("**************************************");
		
         Collections.sort(lst,new Comparator<Employee>() {
        
	 
		public int compare(Employee s1, Employee s2) {
			if(s1.empId > s2.empId) {
				return 1;
			}else if (s1.empId<s2.empId) {
				return -1;
			}else {
			return 0;	
			}}
	});
         System.out.println("Affter ID Sorting descending Order ===========>");
 		System.out.println(lst);
 		System.out.println("**************************************");
 		
 		Collections.sort(lst,new Comparator<Employee>() {
 	        
	  public int compare (Employee t1, Employee t2) {
      		 return t1.getEmpName().compareTo(t2.getEmpName());
      	 }
       });

	System.out.println("Affter Name Sorting ascending Order ===========>");
	System.out.println(lst);
	System.out.println("**************************************");
	
	Collections.sort(lst,new Comparator<Employee>() {
	        
		  public int compare (Employee t1, Employee t2) {
	      		 return t1.getEmpName().compareTo(t2.getEmpName());
	      	 }
	       });
	System.out.println("Affter Name Sorting descending Order ===========>");
	System.out.println(lst);
	System.out.println("**************************************");
	
	Collections.sort(lst,new Comparator<Employee>() {
		
	public int compare(Employee s1, Employee s2) {
		if(s1.salary > s2.salary) {
			return 1;
		}else if (s1.salary<s2.salary) {
			return -1;
		}else {
		return 0;	
		}}
});

System.out.println("Affter salary Sorting ascending Order ===========>");
System.out.println(lst);
System.out.println("**************************************");
      
Collections.sort(lst,new Comparator<Employee>() {
	
public int compare(Employee s1, Employee s2) {
	if(s1.salary > s2.salary) {
		return 1;
	}else if (s1.salary<s2.salary) {
		return -1;
	}else {
	return 0;	
	}}
});
System.out.println("Affter salary Sorting descending Order ===========>");
System.out.println(lst);
System.out.println("**************************************");
      
}
}


