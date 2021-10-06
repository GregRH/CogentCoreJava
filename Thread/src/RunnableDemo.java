
public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// RunnableImpl runnableImpl = new RunnableImpl();
		Thread thread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
	}

}
