package com.kn.collections3;

public class Student {
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
			return "Student [id=" + id + ", name=" + name + ", Percentage=" + Percentage + ", toString()="
					+ super.toString() + "]";
		}
     
    	 
     }

