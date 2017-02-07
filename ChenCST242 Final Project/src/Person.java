import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Person {
	private String name;
	private final String id;
	private static int idNumber = 1; // idNumber is shared by all Person objects
	private String phone;

	public Person(String name, String phone) {
		super();
		
		// read from the text file to get the current idNumber
		File idFile = new File("id.txt");
		try {
			Scanner input = new Scanner(idFile);
			idNumber = input.nextInt();
		} catch (FileNotFoundException e1) {

		}
		
		id = String.valueOf(idNumber++);
		this.name = name;
		this.phone = phone;
		try {
			PrintWriter pw = new PrintWriter("id.txt");
			pw.print(idNumber);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", phone=" + phone + "]";
	}

}
