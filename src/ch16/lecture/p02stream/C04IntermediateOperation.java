package ch16.lecture.p02stream;

import java.util.stream.Stream;

public class C04IntermediateOperation {
	public static void main(String[] args) {
		// 중간연산(메소드) : 리턴 타입 => xxxStream

		
		// limit : element 개수 제한
		Integer r1 = Stream.of(3, 4, 5, 9, -1, 10, 11)
				.limit(5) // 중간연산
				.max((x, y) -> x - y) // 최종연산		
				.get();
		System.out.println(r1);
		
		
		// skip : element 몇개 무시
		Integer r2 = Stream.of(3,4,5,9,10,11)
				.skip(2) //2개 무시 (3,4 무시)
				.min((x, y) -> x - y)
				.get(); 
		System.out.println(r2);
		
		
		// filter : Predicate에서 true 나온것만 추림
		Integer r3 = Stream.of(3,4,5,6,7,8)
				.filter((e) -> e % 2 == 0) // 짝수만 선택 (중간연산)
				.reduce((x, y) -> x + y) // 총합 출력 최종연산)
				.get();
		System.out.println(r3); //18
		
		Integer r4 = Stream.of(3,4,5,6,7,8)
				.filter((e) -> e % 2 != 0) // 홀수만 선택 (중간연산)
				.reduce((x, y) -> x + y) // 총합 출력 (최종연산)
				.get();
		System.out.println(r4); //15
		
		
		// distinct : 중복 제거
		Integer r5 = Stream.of(3,3,4,4,5,5,5,6,7)
				.distinct() // 3,4,5,6,7
				.reduce((x, y) -> x + y)
				.get();
		System.out.println(r5);
		
		
		// sorted : 정렬한 스트림 리턴
		Stream.of(5,3,0,7,9,1)
			.sorted() //오름차 정렬
			.forEach(e -> System.out.println(e));

		
		
		// 중간 연산 조합
		Stream.of(5,3,0,7,9,1)
			.sorted()
			.limit(3)
			.forEach(e -> System.out.println(e)); //0 1 3
		
		Stream.of(5,3,0,7,9,1)
			.limit(3)
			.sorted()
			.forEach(e -> System.out.println(e)); //0 5 3
	
	}
}
