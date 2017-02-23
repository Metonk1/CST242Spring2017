package p1;

import java.util.ArrayList;

public class StudentBag {
	ArrayList<Student> myList = new ArrayList<>();

	public void insert(Student s) {
		myList.add(new Student(s));
	}

	public void display() {
		for (Student s : myList) {
			System.out.println(s);
		}
	}

	public Student findById(String id) {
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i).getId().equals(id)) {
				return myList.get(i);
			}
		}
		return null;
	}
	
	public Student removeById(String id) {
		int counter = 0;
		for(Student s : myList) {
			
			if(s.getId().equals(id)) {
				break;
			}
			counter++;
		}
		if (counter < myList.size() ) {
			return myList.remove(counter);
		} else {
			return null;
		}
	}

}
