package interview.questions.objectcreation;

import java.io.Serializable;

public class Student implements Cloneable, Serializable {
	public int collegeId = 101;
	
	public Student() {
		System.out.println("Inside student constructor");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
