
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		//s.pop();
	//	s.pop();
		s.inc(2, 1);
		System.out.println(s.pop()+":"+s.pop());
	}

}
class Stack{
	public  Integer value;
	private  Stack next;
	private boolean hasNext;
	public Stack() {
		this.value = null;
		this.next=null;
		this.hasNext = false;
	}
	public void push(int i) {
		
		if(hasNext==false) {
			value = i;
			hasNext=true;
			this.next = new Stack();
		}
		else {
			next.push(i);
		}
	}
	public Integer pop() {
		if(!next.hasNext) {
			hasNext=false;
			next=null;
			return value;
		}
		else
			return next.pop();
	}
	public void inc(int depth, int inc) {
		if(next.hasNext) {
			next.inc(depth, inc);
		}
		else {
			value = value+inc;
		}
	}
}
