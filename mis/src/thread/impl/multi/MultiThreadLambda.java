/*
 * Multi thread functionality using lambda function in thread, implementing join function such that main function
 * waits and checking the alive status of the thread.
 */
package thread.impl.multi;

public class MultiThreadLambda {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(() -> {
			for(int i=1; i<=5; i++) {
				System.out.println("Thread-1: "+ i +" Priority" +Thread.currentThread().getPriority());
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i=1; i<=5; i++) {
				System.out.println("Thread-2: "+ i +" Priority" +Thread.currentThread().getPriority());
			}
		});
		
		System.out.println("Default thread priority: ");
		System.out.println("Thread - 1 : " + t1.getPriority());
		System.out.println("Thread - 2 : " + t2.getPriority());
		
		System.out.println("Setting thread priority");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Updated thread priority: ");
		System.out.println("Thread - 1 : " + t1.getPriority());
		System.out.println("Thread - 2 : " + t2.getPriority());
		
		t1.start();
		System.out.println("Alive status of thread1: "+t1.isAlive());
		
		t2.start();
		System.out.println("Alive status of thread2: "+t2.isAlive());
		
		t1.join();
		t2.join();
		System.out.println("Bye");
		
		System.out.println("Alive status of thread1: "+t1.isAlive());
		System.out.println("Alive status of thread2: "+t2.isAlive());
		
	}

}
