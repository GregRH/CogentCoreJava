package org;

public class MethodChainingClass {
	public int x;
	public void show() {
		System.out.println(x);
	}
	public MethodChainingClass setX( int x) {
		this.x = x;
		return this;
	}
}
