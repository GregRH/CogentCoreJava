public class APrime {
	public static void main(String[] args) {
		String o1 = "A123DF	a a a a a a";
		String o2 = "FC23DR 1 2 3 4";
		System.out.println(getID(o2));
		System.out.println(getID(o1));
	}
	public static String getMetaData(String order){
		String meta = "";
		return meta;
	}
	public static String getID(String order){
		char c[]=order.toCharArray();
		String id = "";
		for(int i =0;i<order.length();i++){
			if((c[i]>='A'&&c[i]<='Z')||(c[i]>='a'&&c[i]<='z')||(Math.abs(c[i]-'0')<10))
				id+=c[i];	
			else
				break;
		}
		return id;
	}
}
