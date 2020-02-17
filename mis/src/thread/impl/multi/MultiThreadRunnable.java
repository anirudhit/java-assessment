/*
 * Multi thread functionality implementing runnable interface.
 */
package thread.impl.multi;

public class MultiThreadRunnable {

	public static void main(String[] args) {
		Aa a = new Aa();
		Thread a1 = new Thread(a);
		a1.start();
		
		Bb b = new Bb();
		Thread b1 = new Thread(b);
		b1.start();
	}

}

class Aa implements Runnable{
	@Override
	public void run() {
		showMessage();
	}
	
	private void showMessage() {
		System.out.println("Message from "+getClass());
	}
}

class Bb implements Runnable{
	@Override
	public void run() {
		showMessage();
	}
	
	private void showMessage() {
		System.out.println("Message from "+getClass());
	}
}
