/*
 * Implement single thread using runnable interface
 */
package thread.impl.single;
public class SingleThreadWithImplement {

	public static void main(String[] args) {
		SingleThreadImpl s1 = new SingleThreadImpl();
		Thread t1 = new Thread(s1);
		System.out.println("Id	:	"+t1.getId());
		System.out.println("Name	:	"+t1.getName());
		t1.start();
	}

}

class SingleThreadImpl implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread 1 started in class implemented with runnable.");
	}
	
}
