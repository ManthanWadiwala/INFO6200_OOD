package edu.neu.csye6200;

public class Student extends Person {
	private double gpa;

	
	public Student(int id, int age, String lastName, double gpa) {
	super(id, age, lastName);
	this.gpa = gpa;
}
	
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "Student [id= " + id + ", lastName= " + lastName + ", age= " + age + ", gpa= " + gpa+"]";
	}

	public static int compareByGpa(Student s1, Student s2) {
		return Double.compare(s1.getGpa(), s2.getGpa());
		
	}


}
