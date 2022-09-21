package ch18.lecture.p02outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C04OutputStream {
	public static void main(String[] args) throws Exception {
		String inputFile = "src/ch18/lecture/p02outputstream/C04OutputStream.java";
		String outputFile = "C:\\Users\\user\\Desktop\\output\\output4.txt";
		
		InputStream is = new FileInputStream(inputFile);
		OutputStream os = new FileOutputStream(outputFile);
		
		// 파일 복사 코드
		byte[] b = new byte[10];
		int len = 0;		
		while((len = is.read(b)) != -1) {
			os.write(b, 0, len);
		}
		
		is.close();
		os.close();
	}
}
