package ch18.lecture.p05writer;

import java.io.FileWriter;
import java.io.Writer;

public class C01Writer {
	public static void main(String[] args) throws Exception {
		// Writer : 문자 단위로 출력하는 스트림
		
		String fileName = "C:\\Users\\user\\Desktop\\output\\output5.txt";
		Writer wr = new FileWriter(fileName);
		
		// write() 메소드 : 문자 하나 출력
		wr.write('a');
		wr.write('b');
		wr.write('한');
		wr.write(9742);
		
		wr.close();
	}
}
