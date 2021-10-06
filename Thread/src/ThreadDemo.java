
public class ThreadDemo{
	public static void main(String[] args) {
		MyThread myThread = new MyThread("myThread");
		myThread.setPriority(10);
		//myThread.setName("myThread");
		myThread.start();
		Thread thread = Thread.currentThread();
		System.out.println(thread);
	}
}
