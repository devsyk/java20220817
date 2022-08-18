package ch04.book.exercise;

public class Ex04 {
	public static void main(String[] args) {
		
		/*
		 * Q. 두 개의 주사위를 던졌을 때 
		 *    눈의 합이 5가 아니면 계속 던지고, 눈의 합이 5이면 실행을 멈추는 코드 
		 * - (눈1, 눈2) 형태로 출력 
		 * - While문, Math.random() 메소드 이용
		 */		
		while(true) {
			// 1. 1부터 6까지의 임의의 수 가져오기
			int val1 = (int) (Math.random() * 6) + 1;
			int val2 = (int) (Math.random() * 6) + 1;
			
			// 2. 가져온 두 수 (x, y) 형태로 출력
			// - 전체 과정 나와야 하기 때문에 while문 안 if문 밖에 적기
			System.out.println("(" + val1 + ", " + val2 + ")");
			
			// 3. 합이 5이면 종료
			if(val1 + val2 == 5) {
				break; 
			}
		}
		
	}
}
