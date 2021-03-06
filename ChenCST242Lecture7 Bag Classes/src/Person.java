import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class Person {
	private String lName;
	private String fName;
	private String id;
	private Address address;

	private static int idNum = 1;

	public Person(String lName, String fName, Address address) {
		super();
		this.lName = lName;
		this.fName = fName;
		this.address = address;

		// open the id.txt file to get the latest idNum
		File file = new File("id.txt");
		try {
			Scanner readFile = new Scanner(file);
			idNum = readFile.nextInt();
			readFile.close();
		} catch (FileNotFoundException e1) {
		}

		this.id = String.valueOf(idNum++);
		
		for(int j = id.length(); j < 8; j++) {
			if(j == 7) {
				id = "P" + id;
				break;
			}
			id = "0" + id;
		}
		
		
//		System.out.println("The last name is: " + lName);
//		System.out.println("The id number is: " + ("PPPPPP" + id));
//		System.out.println("The real id number is: " + id);

		// save idNum into id.txt file for next object creation
		try {
			PrintWriter pw = new PrintWriter("id.txt");
			pw.println(idNum);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = new Address(address);
	}

	public String getId() {
		return id;
	}
	
	protected void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [lName=" + lName + ", fName=" + fName + ", id=" + id + "]";
	}

}
