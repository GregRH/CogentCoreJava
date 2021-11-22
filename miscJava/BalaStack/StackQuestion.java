import java.util.Scanner;



public class StackQuestion

{
	public static void main(String[] args) {
		Stack s = new Stack();
		Scanner sc = new Scanner(System.in);

		String intput = sc.nextLine();

		s.push(4);
		s.push(5);//	s.push(2);	s.push(3);
		s.inc(2,1);
		Integer pop;
		do{
			pop = s.pop();
			
			System.out.println(pop!=null ? pop : "Empty");
		}	while(pop != null);

	}


}
	class Stack{
		Integer value;
		Stack next;
		boolean hasNext;
		public Stack(){
			this.next =null;
			this.hasNext =false;
			this.value =null;

		}
		public void push(int i){
			if(this.value==null){
				this.value=i;
			}else
			{
				Stack temp = new Stack();
				temp.value=this.value;
				temp.next=this.next;
				temp.hasNext=this.hasNext;
				this.value=i;
				this.next=temp;
				this.hasNext=true;
			}
		}
		public Integer pop(){
			Integer temp = this.value;
			
			if(hasNext){
				this.value=this.next.value;
				this.hasNext=this.next.hasNext;
				this.next=this.next.next;
			}
			else{
				this.value=null;
				this.next=null;
				this.hasNext=false;
			}
			return temp;
		}
		public void inc(int depth, int x){
			if(depth>0){
				int temp = this.pop()+x;
				inc(depth-1,x);
				this.push(temp);
			}
		}
	}
