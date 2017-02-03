package p9;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		do {
			System.out.println("Enter first name or Exit to end: ");
			String fName = kb.nextLine().trim();
			if(fName.equalsIgnoreCase("Exit")) {
				break;
			}
			System.out.println("Enter last name: ");
			String lName = kb.nextLine();
			System.out.println("Enter ID number: ");
			String id = kb.nextLine();
			System.out.println("Enter GPA: ");
			double gpa = kb.nextDouble();
			kb.nextLine();
			System.out.println("Enter courses separated by comma");
			String courses = kb.nextLine();
			String[] tokens = courses.split(",");
			for (int i = 0; i < tokens.length; i++) {
				tokens[i] = tokens[i].trim().toUpperCase();
			}
			Student s1 = new Student(fName, lName, id, gpa, tokens);
			System.out.println(s1);
		} while (true);
		
	}

}
