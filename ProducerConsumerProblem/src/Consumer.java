import java.util.List;

public class Consumer implements Runnable {
	private final List<Integer> taskQueue;
	
	
	public Consumer(List<Integer> sharedQueue) {
		super();
		this.taskQueue = sharedQueue;
	}


	@Override
	public void run() {
		while(true) {
			try {
				consume();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	private void consume() throws InterruptedException {
		synchronized (taskQueue) {
			while(taskQueue.isEmpty()) {
				System.out.println("Queue is empty "
						+ Thread.currentThread().getName()
						+" is waiting "+taskQueue.size());
				taskQueue.wait();
			}
			Thread.sleep(1000);
			int i = taskQueue.remove(0);
			System.out.println("Consumed value "+i);
			taskQueue.notifyAll();
		}
	}
}
