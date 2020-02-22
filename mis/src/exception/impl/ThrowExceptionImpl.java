/*
 * Throw conditional exception using throw keyword
 */
package exception.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowExceptionImpl {

	public static void main(String[] args) throws IOException {
		
		int i,j,k;
		
		i = 8;
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter j value: ");
			j = Integer.parseInt(br.readLine());
			k = i+j;
			if(k < 10) {
				throw new ArithmeticException();
			}else {
				System.out.println("k: "+k);
			}
		}
		catch(IOException e) {
			System.out.println("Input or Output exception "+e);
		}
		catch (ArithmeticException e) {
			System.out.println("k value should be greater than 10");
		}
		finally {
			br.close();
		}
	}

}
