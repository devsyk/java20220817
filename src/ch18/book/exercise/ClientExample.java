package ch18.book.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = "C:\\Users\\user\\Desktop\\output\\squidgame.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();		
		// 파일 이름이 저장된 길이 100바이트 보내기
		byte[] b = new byte[100];
		fileName.getBytes(0, fileName.length(), b, 0);
		os.write(b);
		//
		
		System.out.println("[파일 보내기 시작]" + fileName);		
		// 파일 데이터 보내기
		FileInputStream fis = new FileInputStream(file);
		int len = 0;
		while ((len = fis.read(b)) != -1) {
			os.write(b, 0, len);
		}
		//
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
	}
}
