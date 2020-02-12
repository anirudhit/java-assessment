/* Program to print longest name. Input integer N i.e. total number of names, 
 * and next line contains N space seperated names of different length 
 * */
package string.handling;

import java.util.Scanner;

public class LongestString {

	public static void main(String[] args) {
		
		int totNames;
		int nameLength = 0;
		int nameIndex = 0;
		System.out.print("Total number of names: ");
		Scanner sc = new Scanner(System.in);
		totNames = sc.nextInt();
		String namesArr[] = new String[totNames];
		
		System.out.println("Enter the names: ");
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<totNames; i++) {
			namesArr[i] = scanner.nextLine();
		}
		
		for(int i=0; i<totNames; i++) {
			if(namesArr[i].length() > nameLength) {
				nameLength = namesArr[i].length();
				nameIndex = i;
			}
		}
		
		System.out.println("Result: "+ namesArr[nameIndex]);
		
		sc.close();
		scanner.close();

	}

}
