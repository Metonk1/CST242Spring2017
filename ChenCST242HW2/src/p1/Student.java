package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Student {
	private String name;
	private String id;
	private static int idNumber = 0;

	public Student(String name) {
		super();
		this.name = name;

		// try to open the id.txt file to read next available idNumber
//		File file = new File("id.txt");
//		try {
//			Scanner in = new Scanner(file);
//			idNumber = in.nextInt();
//			in.close();
//		} catch (FileNotFoundException e) {
//		}

		id = String.valueOf(idNumber++);

//		try {
//			PrintWriter pw = new PrintWriter("id.txt");
//			pw.print(idNumber);
//			pw.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
	}
	// overloaded constructor
	public Student(Student s){
		this.name = s.name;
		this.id = s.id;
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}