package ch04.book;

public class E11ForMultiplicationTable {
	public static void main(String[] args) {
		//구구단 출력하기
		for(int i = 2; i <= 9; i++) {
			System.out.println("=== " + i + "단 ===");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}
	}
}
