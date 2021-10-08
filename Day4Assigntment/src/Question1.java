
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(moveHash("Move#Hash#to#Front"));
	}
	public static String moveHash(String str){
		StringBuffer strb=new StringBuffer(str);
		for(int i =0;i<strb.length();i++){
			if(strb.charAt(i)=='#') {
				strb.deleteCharAt(i);
				strb.insert(0, '#');
			}
		}
		return strb.toString();
	}
}
