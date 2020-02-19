package collection.impl.list;

public class Student implements Comparable<Student> {
	
	int id;
	String firstName;
	String lastName;
	String gender;
	
	
	public Student(int id, String firstName, String lastName, String gender) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
}
