package ch12.book;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1(); // User1 스래드 생성
		user1.setCalculator(calculator); // 공유 객체 설정
		user1.start();

		User2 user2 = new User2(); // User2 스래드 생성
		user2.setCalculator(calculator); // 공유 객체 설정
		user2.start();
	}
}
