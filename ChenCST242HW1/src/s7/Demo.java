package s7;

public class Demo {

	public static void main(String[] args) {
		Car car = new Car("Red", "BMW", "2017", 0);
		car.speedUp();
		car.speedUp();
		System.out.println(car);
		car.slowDown();
		System.out.println(car);
	}

}