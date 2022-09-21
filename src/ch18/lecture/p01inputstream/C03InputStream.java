package ch18.lecture.p01inputstream;

import java.io.FileInputStream;

public class C03InputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/lecture/p01inputstream/C03InputStream.java";
		FileInputStream fis = new FileInputStream(path);
		
		byte[] buffer = new byte[10];
		
		int cnt = 0;		
		while(fis.read(buffer) != -1) {
			cnt++;
		}
		
		System.out.println(cnt + "번 읽음");
		
		fis.close();
	}
}
