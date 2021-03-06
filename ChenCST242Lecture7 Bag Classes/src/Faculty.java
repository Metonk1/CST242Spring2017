
public class Faculty extends Person {
	private String officeNumber;
	private double salary;

	public Faculty(String lName, String fName, Address address, String officeNumber, double salary) {
		super(lName, fName, address);
		this.officeNumber = officeNumber;
		this.salary = salary;
		super.setId("F" + super.getId().substring(1));
		System.out.println("New ID seen from the Faculty constructor: " + super.getId());
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Faculty [" + super.toString() + ", officeNumber=" + officeNumber + ", salary=" + salary
				+ "]";
	}

	

}
