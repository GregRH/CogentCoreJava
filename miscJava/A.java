public class A {
public static void main(String[] args) {
	B a = new B();
	System.out.println(a.test());
}
}
class B{

	int test(){
		try {
			return 100;
		} catch(Exception e){
			return 200;
		}finally{
			return 300;
		}
	}
}

