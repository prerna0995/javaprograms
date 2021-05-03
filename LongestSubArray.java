import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = {1,1,1,3,3,2,2};
		List<Integer> arr = Arrays.asList(1,1,3,3,2); 
		System.out.print(largestSubArray(arr));
	}

	public static int largestSubArray(List<Integer> arr) {
		int max = 0;
		Set<Integer> set = new HashSet<Integer>();
		int i = 0;
		int j = 1;
		if(arr.size()==1){
			return 1;
		}
		else
			while (i < arr.size() - 1) {
				set.add(arr.get(i));
				while (j < arr.size() && Math.abs(arr.get(i) - arr.get(j)) < 2) {
					if (!set.contains(arr.get(j))) {
						if (set.size() == 2) {
							break;
						} else {
							set.add(arr.get(j));
						}
					}
					++j;
				}
				max = Math.max(max, j - i);
				j = ++i + 1;
				set.clear();
			}
		return max;
	}
}

