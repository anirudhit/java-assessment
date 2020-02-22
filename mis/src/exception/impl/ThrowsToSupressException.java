/*
 * Suppress exception using throws keyword
 */
package exception.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsToSupressException {

	public static void main(String[] args) throws IOException {
		
		int i,j,k;
		
		i = 8;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter j value: ");
		j = Integer.parseInt(br.readLine());
		
		k = i/j;
		
		System.out.println("k: "+k);
		
	}

}
