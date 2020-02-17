package statickeyword.impl;

public class StaticImpl {
	
	static {
		System.out.println("Static block usage.");
	}

	public static void main(String[] args) {
		System.out.println("College name: "+Student.collegeName);
		System.out.print("College address: ");
		Student.collegeInfo();
		
		Student s1 = new Student("James", "Borg", 1);
		Student s2 = new Student("Mike", "Henrey", 2);
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
