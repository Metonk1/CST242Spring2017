package p2;

import p1.Student;

public class PartTimeStudent extends Student{
	private int creditHours;

	public PartTimeStudent(String n, String i, double g, int creditHours) {
		super(n, i, g); // super class (Student) constructor
		this.creditHours = creditHours;
	}
	

}