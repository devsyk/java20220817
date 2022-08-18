package ch04.book.exercise;

public class Ex05 {
	public static void main(String[] args) {
		
		/*
		 * Q. 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y)의 형태로 출력 
		 * - x, y : 10이하 자연수 
		 * - 중첩 for문 이용
		 */
		//1. 10이하의 자연수 x
		for(int i = 1; i <= 10; i++) {
			//2. 10이하의 자연수 y
			for(int j = 1; j <= 10; j++) {
				//3. 방정식 4x + 5y = 60을 만족하는 경우 출력
				if((4*i) + (5*j) == 60 ) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
		
	}
}
