package ch04.book;

public class E07SwitchNoBreakCase {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4 + 8); //8~11 사이 정수 뽑기
		System.out.println("[현재시간: " + time + " 시]");
		
		switch(time) { //break문 사용 안하면 다음 case 연달아 실행
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의합니다.");
			case 10:
				System.out.println("업무봅니다.");
			default:
				System.out.println("외근갑니다.");
			
		}
		
	}
}
