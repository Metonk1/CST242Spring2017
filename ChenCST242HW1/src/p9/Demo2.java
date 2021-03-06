package p9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args)  {
		//open the data file
		File inputFile = new File("StudentData");
		Scanner in = null;
		try {
			in = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(in.hasNextLine()) {
			String input = in.nextLine();
			String[] tokens = input.split(";");
			String fName = tokens[0];
			String lName = tokens[1];
			String id = tokens[2];
			double gpa = Double.parseDouble(tokens[3].trim());
			String[] courses = tokens[4].split(",");
			for(int i = 0; i < courses.length; i++) {
				courses[i] = courses[i].toString().toUpperCase().trim();
			}
			Student s = new Student(fName, lName, id, gpa, courses);
			System.out.println(s);
		}
		in.close();
	}
}
