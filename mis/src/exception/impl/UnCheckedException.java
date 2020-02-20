/*
 * Unchecked exception implementation
 */
package exception.impl;

public class UnCheckedException {

	public static void main(String[] args) {
		int i = 8;
		int j = 2;
		int k = 0;
		int arr[] = new int[4];
		try {
			k = i/j;
			
			for(int counter=0; counter<=4; counter++) {
				arr[counter] = counter+1;
			}
			
			for(int val: arr) {
				System.out.println(val);
			}
			
			
		}catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero. "+e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Maximum array size is 4. " +e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("k: "+k);
	}

}
