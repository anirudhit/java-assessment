/*
 * Multi thread functionality with anonymous thread function.
 */
package thread.impl.multi;

public class MultiThreadAnonymous {

	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				MultiThreadAnonymous.showMessage("Thread t1");
				System.out.println("Message from anonymous Thread-1 run");
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				MultiThreadAnonymous.showMessage("Thread t2");
				System.out.println("Message from anonymous Thread-2 run");
			}
		};
		
		
		t1.start();
		t2.start();
	}
	
	private static void showMessage(String msg) {
		System.out.println("Message from " +msg);
	}

}
