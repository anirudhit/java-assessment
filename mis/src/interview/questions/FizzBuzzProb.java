/*
 * Print Fizz if number divisible by 3, Buzz if number 5 and FizzBuzz if number divisible by 3 and 5 
 */
package interview.questions;

public class FizzBuzzProb {

	public static void main(String[] args) {
		fizzBuzz(20);

	}
	
	public static void fizzBuzz(int x) {
		for(int num=1; num<=x; num++) {
			if((num % 3 == 0) && (num % 5 == 0)) {
				System.out.println("FizzBuzz");
			}else if(num % 3 == 0) {
				System.out.println("Fizz");
			}else if(num % 5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(num);
			}
		}
	}

}
