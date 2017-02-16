
public class Course {
	private String courseNumber; //CST111
	private String courseName; // Intro to CS
	private int credits;		// 4
	private String grade;	// "B+"

	public Course(String courseNumber, String courseName, int credits, String grade) {
		this.courseNumber = courseNumber;
		this.courseName = courseName;
		this.credits = credits;
		this.grade = grade;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Course [courseNumber=" + courseNumber + ", courseName=" + courseName + ", credits=" + credits
				+ ", grade=" + grade + "]";
	}

}
