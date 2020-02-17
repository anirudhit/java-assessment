/*
 * Implemented single thread extending thread class
 */

package thread.impl.single;
public class SingleThreadWithExtends {
	public static void main(String[] args) {
		SingleThread s1 = new SingleThread();
		s1.start();
	}
}

class SingleThread extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread counter: "+i);
		}
	}
}