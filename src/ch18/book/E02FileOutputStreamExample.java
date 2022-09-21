package ch18.book;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class E02FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String orginalFileName = "C:\\Users\\user\\Desktop\\output\\오징어게임.jpg";
		String targetFileName = "C:\\\\Users\\\\user\\\\Desktop\\\\output\\\\오징어게임2.jpg";
		FileInputStream fis = new FileInputStream(orginalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
			//System.out.println(readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}
