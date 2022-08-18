package ch04.book.exercise;

public class Ex03 {
	public static void main(String[] args) {
		
		/* Q. 1부터 100까지 정수 중에서 3의 배수 총합 구하기(for문) */
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum = sum + i;
			}
		}		
		System.out.println("3의 배수의 총합 : " + sum);
		
	}
}
