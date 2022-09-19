package ch15.book.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; //최고 점수를 받은 아이디
		int maxScore = 0; //최고 점수
		int totalScore = 0; //점수 합계				
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			Integer value = map.get(key);
			totalScore += value;
			if(maxScore < value) {
				maxScore = value;
				name = key;
			}
		}
		
		System.out.println("평균점수: " + totalScore/map.size());
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
				
	}
}
