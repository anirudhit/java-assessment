package collection.impl.set;

public class Student {
	private int id;
	private String firstName;
	private String gender;
	
	public Student(int id, String firstName, String gender) {
		super();
		this.id = id;
		this.firstName = firstName;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
