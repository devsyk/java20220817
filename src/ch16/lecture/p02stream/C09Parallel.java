package ch16.lecture.p02stream;

import java.util.List;

public class C09Parallel {
	public static void main(String[] args) {
		List<String> list1 = List.of("java", "spring", "css", "jsp", "html");
		
		list1.stream()			
			.forEach((e) -> System.out.println(e));
		
		list1.parallelStream()
			.forEachOrdered((e) -> System.out.println(e)); //리스트 순서 보장
	}
}
