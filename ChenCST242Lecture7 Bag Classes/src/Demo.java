
public class Demo {

	public static void main(String[] args) {
		Address address1 = new Address("1", "Main St.", "Selden", "NY", "11784");
		Person p1 = new Person("Adam", "John", new Address(address1));
//		Person p2 = new Person("Eve", "Jane", new Address(address1));
		System.out.println(p1.getAddress());
		p1.getAddress().setStNum("2");
		System.out.println(p1.getAddress());
//		System.out.println(p2.getAddress());
	}

}