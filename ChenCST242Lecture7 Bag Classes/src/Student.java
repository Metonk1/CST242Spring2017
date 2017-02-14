
public class Student extends Person {
	private double gpa;
	private String[] coursesTook;
	private String[] coursesTaking;
	private String[] coursesToTake;

	public Student(String lName, String fName, Address address, String[] coursesTook, String[] coursesTaking,
			String[] coursesToTake) {
		super(lName, fName, address);
		this.gpa = 4.0;
		this.coursesTook = coursesTook;
		this.coursesTaking = coursesTaking;
		this.coursesToTake = coursesToTake;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(String[] coursesTook) {
		
		this.gpa = gpa;
	}

	public String[] getCoursesTook() {
		return coursesTook;
	}

	public void setCoursesTook(String[] coursesTook) {
		this.coursesTook = coursesTook;
	}

	public String[] getCoursesTaking() {
		return coursesTaking;
	}

	public void setCoursesTaking(String[] coursesTaking) {
		this.coursesTaking = coursesTaking;
	}

	public String[] getCoursesToTake() {
		return coursesToTake;
	}

	public void setCoursesToTake(String[] coursesToTake) {
		this.coursesToTake = coursesToTake;
	}
	
	

}