package ch04.book;

public class E13WhileKeyControl {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) { //Enter키 : 13 or 10
				System.out.println("-------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");				
				System.out.println("-------------------------");
				System.out.print("선택 : "); //줄바꿈 안함
			}
			
			keyCode = System.in.read(); //키보드의 키보드를 읽음
			
			if(keyCode == 49) { // 1
				speed++; //증속
				System.out.println("현재 속도 = " + speed);
			} else if(keyCode == 50) { //2
				speed--; //감속
				System.out.println("현재 속도 = " + speed);
			} else if(keyCode == 51) { //3
				run = false; //while문 종료
			}
			
		}
		System.out.println("프로그램 종료");
	}
}
