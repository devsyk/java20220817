package ch13.lecture.p04genericMethod;

import java.util.Arrays;
import java.util.List;

public class C02Method {
	public static void main(String[] args) {
		List<String> list1 = Arrays.<String>asList("java", "spring", "jsp");
		List<Integer> list2 = Arrays.<Integer>asList(99, 100, 200);
		
		
		//타입 파라미터 생략 가능
		List<String> list3 = Arrays.asList("topgun", "thor", "ironman");
		List<Integer> list4 = Arrays.asList(100, 200, 300);
	}
}
