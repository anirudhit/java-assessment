package statickeyword.impl;

public class Student {
	
	String firstName;
	String lastName;
	int id;
	static String collegeName = "UAH";
	
	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
	}
	
	public static void collegeInfo() {
		System.out.print("UAH, HSV AL 35816 \n");
	}
	

}
