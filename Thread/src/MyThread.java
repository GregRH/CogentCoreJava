
public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}	
	@Override
	public void run() {
		System.out.println("Hello from abhi");
		Thread thread = Thread.currentThread();
		System.out.println(thread);
	}
}
