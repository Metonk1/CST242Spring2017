package p9;

import java.util.Arrays;

public class Student {
	private String fName;
	private String lName;
	private String id;
	private double gpa;
	private String[] courses;

	public Student(String fName, String lName, String id, double gpa, String[] courses) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.id = id;
		this.gpa = gpa;
		this.courses = courses;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
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
		this.gpa = gpa;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [fName=" + fName + ", lName=" + lName + ", "
				+ "id=" + id + ", gpa=" + gpa + ", courses="
				+ Arrays.toString(courses) + "]";
	}
	
	

}
