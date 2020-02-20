/*
 * Finally block implementation
 */
package exception.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyImplException {

	public static void main(String[] args) throws IOException {
		int i,j,k;
		i = 8;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("Enter j Value: ");
			j = Integer.parseInt(br.readLine());
			
			k = i/j;
			System.out.println("Solution: "+k);
		}catch (IOException e) {
			System.out.println("IOException: "+e);
		}catch (Exception e) {
			System.out.println("Exception: "+ e);
		}
		
		finally {
			System.out.println("Finally Bye.");
			br.close();
		}
		
	}

}
