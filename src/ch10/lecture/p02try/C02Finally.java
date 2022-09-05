package ch10.lecture.p02try;

public class C02Finally {
	public static void main(String[] args) {		
		int a = 3, b = 0;
		
		try {
			int c = a / b;
			
			//exception 발생하지 않으면 실행되는 코드
			System.out.println("exception 발생 안함");
			System.out.println(c);
		
		} catch(ArithmeticException e) {
			//exception 발생하면 실행되는 코드
			System.out.println("exception 발생함");
		
		} finally {
			//exception 발생여부 상관없이 실행되는 코드
		}
		
		System.out.println("실행이어짐~");
	}
}
