package collection.impl;

public class Student {
	int id;
	String firstName;
	String lastName;
	String state;
	
	public Student(int id, String firstName, String lastName, String state) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", state=" + state + "]";
	}
}
