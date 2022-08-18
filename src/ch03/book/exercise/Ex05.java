package ch03.book.exercise;

public class Ex05 {
	public static void main(String[] args) {
		// Q. 십의 자리 이하 버리기
		int value = 356;
		System.out.println((value / 100) * 100);
		System.out.println(value - (value % 100));
	}
}
