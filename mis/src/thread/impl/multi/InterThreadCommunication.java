/*
 * Inter thread communication using producer consumer problem
 */
package thread.impl.multi;

class Queue {
	int number;
	boolean numberSet = false;
	
	public synchronized void put(int number) throws InterruptedException {
		while(numberSet) {
			wait();
		}
		System.out.println("Put: "+number);
		this.number = number;
		numberSet = true;
		notify();
	}
	
	public synchronized void get() throws InterruptedException {
		while(!numberSet) {
			wait();
		}
		System.out.println("Get: "+number);
		numberSet = false;
		notify();
	}
}

class Producer implements Runnable {
	Queue q;

	public Producer(Queue q) {
		this.q = q;
		Thread t = new Thread(this,"Producer");
		t.start();
	}
	
	@Override
	public void run() {
		int i =0;
		while(true) {
			try {
				q.put(i++);
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
	
}

class Consumer implements Runnable {
	Queue q;

	public Consumer(Queue q) {
		this.q = q;
		Thread t = new Thread(this,"Consumer");
		t.start();
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				q.get();
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}


public class InterThreadCommunication {

	public static void main(String[] args) {
		Queue q = new Queue();
		new Producer(q);
		new Consumer(q);
		
	}

}
