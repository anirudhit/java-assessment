/*
 * Implement thread methods usage.
 */
package thread.impl.single;
public class ThreadMethods {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("Started thread method. ");
			}
		};
		System.out.println(Thread.currentThread());
		System.out.println(thread.getId());
		System.out.println(thread.getName());
		thread.setName("Anonymous thread-1");
		System.out.println(thread.getName());
		Thread.sleep(100);
		thread.start();
	}

}
