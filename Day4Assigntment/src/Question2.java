import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question2 {
	public static void main(String[] args) {
		String in1 = "aabbbbeeeeffggg";
		String in2 = "abbccccc";
		System.out.println(reduceString(in1));
		System.out.println(reduceString(in2));
		
	}
	public static String reduceString(String str) {
		Map<String, Integer> strMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if(strMap.get(""+str.charAt(i))==null)
				strMap.put(""+(str.charAt(i)), 1);
			else {
				strMap.replace(""+str.charAt(i), strMap.get(""+str.charAt(i))+1);
			}
		}
		StringBuilder strb = new StringBuilder();
		Set<String> strKey = strMap.keySet();
		for (String string : strKey) {
			if(strMap.get(string)!=1)
				strb.append(string+strMap.get(string));
			else
				strb.append(string);
		}
		return strb.toString();
	}
}
