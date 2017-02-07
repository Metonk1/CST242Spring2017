package s7;

public class Car {
	private String color;
	private String make;
	private String year;
	private double speed;

	public Car(String color, String make, String year, double speed) {
		super();
		this.color = color;
		this.make = make;
		this.year = year;
		this.speed = speed;
	}
	
	public void speedUp() {
		speed += 10;
	}
	
	public void slowDown() {
		speed -= 10;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", make=" + make + ", year=" + year + ", speed=" + speed + "]";
	}

}
