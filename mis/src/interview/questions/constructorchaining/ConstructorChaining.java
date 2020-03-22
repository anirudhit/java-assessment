/*
 * Constructor chaining implementation
 */
package interview.questions.constructorchaining;

public class ConstructorChaining {
	ConstructorChaining(){
		this(10);
		System.out.println("Inside default constructor");
	}
	ConstructorChaining(int a){
		this(10.5);
		System.out.println("Inside int param constructor");
	}
	ConstructorChaining(double a){
		this(10.5,10);
		System.out.println("Inside double param constructor");
	}
	ConstructorChaining(double a, int b){
		System.out.println("Inside double - int param constuctor");
	}
}
