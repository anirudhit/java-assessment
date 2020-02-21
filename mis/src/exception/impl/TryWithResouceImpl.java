/*
 * Try with resource implementation.
 * Resource declared in try, will be automatically closed and finally block can be avoided to close the resource.
 */
package exception.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResouceImpl {

	public static void main(String[] args) {
		int i,j,k;
		
		i=8;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.print("Enter j value: ");
			j = Integer.parseInt(br.readLine());
			k = i/j;
			System.out.println("k: "+k);
			
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0 - "+e);
		}catch(NumberFormatException e) {
			System.out.println("Please enter a number - "+e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
