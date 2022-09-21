package ch18.lecture.p02outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C01OutputStream {
	public static void main(String[] args) throws Exception {
		// OutputStream : 바이트 단위로 출력하는 스트림
		
		String name = "C:\\Users\\user\\Desktop\\output\\output1.txt";
		OutputStream os = new FileOutputStream(name);
		
		// write() 메소드 : 한바이트 출력
		os.write(0);
		os.write(127);
		os.write(-128);
		
		
		os.close();
	}
}
