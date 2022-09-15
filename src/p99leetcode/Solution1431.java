package p99leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution1431 {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        
        int max = 0;
        for(int num : candies) {
            if(max < num) {
                max = num;
            }
        }
        
        for(int num : candies) {
            if(num + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        
        return list;
    }
}
