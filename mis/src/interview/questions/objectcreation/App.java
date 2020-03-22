/*
 * Object creation in Java
 */

package interview.questions.objectcreation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, 
		ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, 
		InvocationTargetException, CloneNotSupportedException, IOException {
		
		// Object creation using new keyword
		Student s1 = new Student();
		s1.collegeId = 202;
		System.out.println(s1);
		System.out.println(s1.collegeId);
		
		System.out.println("**************************");
		
		// Object creation using newInstance method of class Class (from java.lang.Class)
		
		// Method-1 loading class using class.forName
		System.out.println("\nMethod-1 loading class using class.forName\n");
		Student s2 = (Student)Class.forName("interview.questions.objectcreation.Student").newInstance();
		s2.collegeId = 302;
		System.out.println(s2);
		System.out.println(s2.collegeId);
		
		// Method-2 loading class using Student.class
		System.out.println("\nMethod-2 loading class using Student.class\n");
		Student s3 = Student.class.newInstance();
		s3.collegeId = 402;
		System.out.println(s3);
		System.out.println(s3.collegeId);
		
		System.out.println("**************************");
		
		// Object creation using newInstance method of class Constructor (from java.lang.reflect.Constructor)
		Constructor<Student> stuConst = Student.class.getConstructor();
		Student s4 = stuConst.newInstance();
		s4.collegeId = 502;
		System.out.println(s4);
		System.out.println(s4.collegeId);
		
		System.out.println("**************************");
		
		// Object creation using clone method of class Object
		Student s5 = (Student)s4.clone();
		System.out.println(s5);
		System.out.println(s5.collegeId);
		s5.collegeId = 602;
		System.out.println(s5.collegeId);
		
		System.out.println("**************************");
		
		// Object creation using De-serialization
		
		// First we need to serialize the Student class
		System.out.println("***** Serialization *****");
		FileOutputStream fos = new FileOutputStream("src/interview/questions/objectcreation/Student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student s = new Student();
		oos.writeObject(s);
		oos.close();
		
		// De-serializing student class
		System.out.println("***** De-Serialization *****");
		FileInputStream fis = new FileInputStream("src/interview/questions/objectcreation/Student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s6 = (Student)ois.readObject();
		System.out.println(s6);
		System.out.println(s6.collegeId);
		ois.close();
		
		
	}

}
