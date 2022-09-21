package ch18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class C01InputStream {
	public static void main(String[] args) throws Exception {
		// InputStream : 프로그램 기준으로 입력 받는 객체를 만드는 클래스
		// 입력 단위 : byte
		String path = "src/ch18/lecture/p01inputstream/C01InputStream.java";
		InputStream is = new FileInputStream(path);
		
		
		// read() : 한 바이트 읽기		
		int r1 = is.read();
		int r2 = is.read();
		int r3 = is.read();
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		// 더이상 읽을 바이트가 없으면 -1 리턴
		int cnt = 0;
		while(is.read() != -1) {
			cnt++;
		}
		System.err.println(cnt + "번 읽음");
		
		
		is.close(); // 자원 사용 후 닫기
	}
}
