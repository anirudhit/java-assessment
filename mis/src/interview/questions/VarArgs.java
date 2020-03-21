/*
 * Var-args implementation
 */
package interview.questions;

public class VarArgs {

	public static void main(String...args) {
		int nums[] = {10,20,30}; 
		VarArgs v1 = new VarArgs();
		v1.addNumbers(nums);
		v1.addNumbers(20,30,40);
		v1.addNumbers();
		byte b = 10;
		v1.addNumbers(b,b,b);
	}
	
	void addNumbers(int...numbers) {
		int sum = 0;
		System.out.println("In add numbers with var args: ");
		System.out.println("Number of arguments: "+numbers.length);
		System.out.println("numbers: "+numbers);
		for (int num : numbers) {
			System.out.println(num);
			sum = sum + num;
		}
		System.out.println("Sum of numbers: "+sum);
	}
	
	void addNumbers(int a, int b, int c) {
		int sum = 0;
		sum = a + b + c;
		System.out.println("In add numbers with params: ");
		System.out.println("Sum of numbers: "+sum);
	}
}
