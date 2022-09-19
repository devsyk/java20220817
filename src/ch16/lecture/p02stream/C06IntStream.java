package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class C06IntStream {
	public static void main(String[] args) {
		// 1~10 출력
		System.out.println("== 1~10 출력 ==");
		IntStream.rangeClosed(1, 10)
				.forEach(e -> System.out.println(e));
		
		// 1~100까지 합
		System.out.println("== 1~100까지 합 ==");
		int r1 = IntStream.rangeClosed(1, 100)
				.sum();
		System.out.println(r1);
		
		// 1~100 중 홀수의 합 출력
		System.out.println("== 1~100 중 홀수의 합 ==");
		int r2 = IntStream.rangeClosed(1, 100)
					.filter(e -> e % 2 == 1)
					.sum();
		System.out.println(r2);
		
		// [5, 10, 20, 1, 6]의 평균 출력
		System.out.println("== [5, 10, 20, 1, 6]의 평균 ==");
		double r3 = Arrays.stream(new int[] {5, 10, 20, 1, 6})
				.average()
                .getAsDouble();
		System.out.println(r3);
				
		// 주사위(1~6) 5번 던진 결과 출력
		System.out.println("== 주사위(1~6) 5번 던진 결과 출력 ==");
		IntStream.generate(() -> (int)(Math.random() * 6) +1 )
			.limit(5)
			.forEach(e -> System.out.println(e));
				
		// 로또번호(1~45) 6개 작은 수부터 출력 (중복 없이)
		System.out.println("== 로또번호(1~45) 6개 작은 수부터 출력 (중복 없이) ==");
		IntStream.generate(() -> (int)(Math.random() * 45) +1 )
			.distinct()
			.limit(6)
			.sorted()			
			.forEach(e -> System.out.println(e));
		
	}
}
