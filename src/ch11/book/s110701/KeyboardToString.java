package ch11.book.s110701;

import java.io.IOException;

public class KeyboardToString {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo -2); //배열을 문자열로 변환
		System.out.println(str);
	}
}
