/*
 * Implement single thread using anonymous method.
 */
package thread.impl.single;
public class SingleThreadAnonymous {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("Thread anonymous counter: "+i);
				}
			};
		};
		t1.start();
	}

}
