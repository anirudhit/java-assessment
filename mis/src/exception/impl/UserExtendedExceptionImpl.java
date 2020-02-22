/*
 * Created user specific NumberCheckException and throw it based on a condition
 */
package exception.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserExtendedExceptionImpl {

	public static void main(String[] args) {
		
		int i;
		
		BufferedReader br;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter i value: ");
		
		try {
			i = Integer.parseInt(br.readLine());
			if(i < 10) {
				throw new NumberCheckException("Please check the number. Make i > 10 : ");
			}else {
				System.out.println("i Value: "+i);
			}
		}catch (NumberCheckException e) {
			System.out.println(e);
		}catch (IOException e) {
			System.out.println(e);
		}

	}

}

class NumberCheckException extends Exception {
	public NumberCheckException(String msg) {
		super(msg);
	}
}
