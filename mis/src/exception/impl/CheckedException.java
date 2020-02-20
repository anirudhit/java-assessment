/*
 * Checked exception implementation
 */
package exception.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

	public static void main(String[] args) {
		
		int i, j, k;
		i = 8;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.print("Enter j value: ");
			j = Integer.parseInt(br.readLine());
			
			k = i/j;
			System.out.println("Output: "+k);
		}catch (IOException e) {
			System.out.println("Cannot divide by zero. "+e);
		}catch (Exception e) {
			System.out.println("Unknown exception. "+e);
		}

	}

}
