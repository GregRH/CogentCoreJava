package test;

import org.MyThread;

public class Test {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread);
		t1.start();

	}

}
