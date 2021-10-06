package org;

public class Thread2 extends Thread {
	PrintEven t;
	public Thread2(PrintEven t) {
		this.t=t;
	}
	@Override
	public void run() {
		t.getEven();
	}
}
