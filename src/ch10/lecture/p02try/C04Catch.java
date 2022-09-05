package ch10.lecture.p02try;

public class C04Catch {
	public static void main(String[] args) {
		try {
			int a = 3 / 0;
		} catch (ArithmeticException e) {  //RuntimeException, Exception 가능 (다형성)
			System.out.println("0으로 나눔");
		}
	}
}
