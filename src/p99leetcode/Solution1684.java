package p99leetcode;

public class Solution1684 {	
	public int countConsistentStrings(String allowed, String[] words) {
		// 정규표현식 활용
		String pattern = "[" + allowed + "]+";

		int cnt = 0;
		for (String word : words) {
			if (word.matches(pattern)) {
				cnt++;
			}
		}

		return cnt;
		
		// if, for 사용
//		int cnt = 0;
//		for (String word : words) {
//			if (consistOf(allowed, word)) {
//				cnt++;
//			}
//		}
//
//		return cnt;
	
	}
}
