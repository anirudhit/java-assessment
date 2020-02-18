/*
 * Multi thread functionality with sleep method to make synchronous execution between two threads.
 */
package thread.impl.multi;
public class MultiThreadSynchWithSleep {
	public static void main(String[] args) {
		Thread t1 = new ThreadAa();
		Thread t2 = new ThreadBb();
		
		t1.start();
		t2.start();
	}
}

class ThreadAa extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Message Thread-1 :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class ThreadBb extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Message Thread-2 :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}