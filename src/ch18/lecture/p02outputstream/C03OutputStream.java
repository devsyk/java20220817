package ch18.lecture.p02outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C03OutputStream {
	public static void main(String[] args) throws Exception {		
		String name = "C:\\Users\\user\\Desktop\\output\\output3.txt";
		OutputStream os = new FileOutputStream(name);
		
		// write(byte[] b, int off, int len)
		// param1 : 쓸 데이터
		// param2 : 배열의 시작 위치
		// param3 : 시작위치로부터의 길이
		
		byte[] b = new byte[100];
		
		os.write(b, 1, 3); // b 배열의 1번 ~ 3번 인덱스 (3 byte) 출력
		os.write(b, 0, 15); // b 배열의 0번 ~ 14번 인덱스 (15 byte) 출력
		os.write(b, 50, 30); // b 배열의 50번 ~ 79번 인덱스 (30 byte) 출력
		
		// output3 파일크기 : 48바이트
		os.close();
	}
}