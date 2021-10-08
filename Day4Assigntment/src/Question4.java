import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,3,4,1,4,5,1,2};
		Map<Integer, Integer> occured = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(occured.get(nums[i])==null)
				occured.put(nums[i], 1);
			else {
				occured.replace(nums[i], occured.get(nums[i])+1);
			}
		}
		Set<Integer> keySet = occured.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer + " occures "+ occured.get(integer)+" times");
		}
	}

}
