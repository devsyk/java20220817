package p99leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution0287 {
	public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums) {
            if(!set.add(num)) {
            	return num;
            }
        }
        return 0;
    }
}
