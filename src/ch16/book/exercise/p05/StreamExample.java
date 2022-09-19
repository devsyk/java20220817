package ch16.book.exercise.p05;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
		);
		
		list.stream()
			.filter(e -> e.toLowerCase().contains("java")) //대소문자 상관없이 java 포함한 문자열 필터링
			.forEach(a -> System.out.println(a)); //모든 elelment 출력
		
	}
}
