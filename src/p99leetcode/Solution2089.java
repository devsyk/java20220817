package p99leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2089 {
	public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                list.add(i);
            }
        }
        
        return list;
    }
}
