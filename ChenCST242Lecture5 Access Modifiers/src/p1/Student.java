package p1;

import java.util.Scanner;

/*
 * Access Modifiers:
 * 1. private: only methods of this class can access the instance variables or methods
 * 2. public: anyone in the world can access the field or the method
 * 3. default (aka package access). any methods in the same package can have access
 * 4. protected: any methods from the subclass can have access
 * For our purposes in this class, we will be mostly using private for fields,
 * public for methods
 */

public class Student {
	// instance variable, fields
	private String name;
	private String id;
	private double gpa;

	public Student(String n, String i, double g) {
		name = n;
		id = i;
		gpa = g;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		Scanner kb = new Scanner(System.in);
		if(gpa > 4.0 || gpa < 0.0) {
			while (true) {
				System.out.println("Enter a valid GPA: ");
				gpa = kb.nextDouble();
				if(gpa >= 0.0 && gpa <= 4.0 ) {
					break;
				}
			}
		}
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gpa=" + gpa + "]";
	}

}
