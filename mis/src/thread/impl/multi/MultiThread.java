/*
 * Multi thread functionality extending thread class.
 */
package thread.impl.multi;

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A aa = new A();
		aa.start();
		
		B bb = new B();
		bb.start();
	}

}

class A extends Thread{
	
	@Override
	public void run() {
		showMessage();
	}
	
	void showMessage() {
		System.out.println("Message from Class A.");
	}
}

class B extends Thread{
	
	@Override
	public void run() {
		showMessage();
	}
	
	void showMessage() {
		System.out.println("Message from Class B.");
	}
}
