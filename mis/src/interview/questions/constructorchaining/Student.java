/*
 * Real time constructor chaining implementation
 */
package interview.questions.constructorchaining;

public class Student {
	
	int id;
	String name;
	String city;
	
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	Student(int id, String name, String city) {
		this(id, name);
		this.city = city;
	}
	
	void displayStudentInfo() {
		System.out.println("id: "+ id + " name: " + name + " city: " + city);
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "John doe");
		s1.displayStudentInfo();
		
		Student s2 = new Student(2, "Amanda", "Irving");
		s2.displayStudentInfo();
	}

}
