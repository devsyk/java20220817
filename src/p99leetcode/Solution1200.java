package p99leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1200 {
	public List<List<Integer>> minimumAbsDifference(int[] arr) {
		Arrays.sort(arr); // 정렬 먼저 하면 이중for문 필요 X

		// 가장 작은 차이 구하기
		int minDiff = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			int diff = arr[i] - arr[i - 1];
			minDiff = Math.min(diff, minDiff);
		}

		List<List<Integer>> result = new ArrayList<>();

		for (int i = 1; i < arr.length; i++) {
			int diff = arr[i] - arr[i - 1];

			if (diff == minDiff) {
				List<Integer> pair = new ArrayList<>();
				pair.add(arr[i - 1]);
				pair.add(arr[i]);

				result.add(pair);
			}
		}

		return result;
	}
	
//	public List<List<Integer>> minimumAbsDifference(int[] arr) {
//
//        List<List<Integer>> answer = new ArrayList<>();
//        
//        int min = Integer.MAX_VALUE;
//        for(int i=0; i<arr.length-1; i++) {
//            
//            for(int j=i+1; j<arr.length; j++) {
//                if(min > Math.abs(arr[i] - arr[j])) {
//                    min = Math.abs(arr[i] - arr[j]);
//                }              
//            }
//
//            for(int j=i+1; j<arr.length; j++) {
//                List<Integer> list = new ArrayList<>();
//                if(min == Math.abs(arr[i] - arr[j])) {
//                    list.add(arr[i]);
//                    list.add(arr[j]);
//                    list.sort(Comparator.naturalOrder());
//                    
//                    
//                    answer.add(list);
//
//                }              
//            }
//   
//        }        
//        //answer.sort(answer,Comparator.naturalOrder());
//        return answer;
//    }
}
