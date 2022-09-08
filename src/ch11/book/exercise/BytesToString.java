package ch11.book.exercise;

public class BytesToString {
	public static void main(String[] args) {
		//바이트를 문자열로 변환
		byte[] bytes = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117 };
		String str = new String(bytes, 0, 10);
		System.out.println(str);
	}
}
