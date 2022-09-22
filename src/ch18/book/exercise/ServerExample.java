package ch18.book.exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket =new ServerSocket();
		serverSocket.bind(new InetSocketAddress("localhost", 5001));
		
		System.out.println("[서버 시작]");
		
		while(true) {
			try {
				Socket socket = serverSocket.accept();
				
				InputStream is = socket.getInputStream();
				
				byte[] bytes = new byte[1000];
				int readByteCount = -1;
				
				// 클라이언트가 보낸 100바이트를 먼저 읽고 파일 이름 얻기
				is.read(bytes);
				String fileName = new String(bytes);
				//			
				fileName = fileName.trim();
				
				System.out.println("[파일 받기 시작]" + fileName);
				// 파일 데이터 받고 폴더에 저장				
				FileOutputStream fos = new FileOutputStream("C:\\Temp\\" + fileName);
				while ((readByteCount = is.read(bytes)) != -1) {
					fos.write(bytes, 0, readByteCount);
				}
				//
				System.out.println("[파일 받기 완료]");
				
				fos.close();
				is.close();
				socket.close();
			} catch(Exception e) {
				break;
			}
			
			serverSocket.close();
			System.out.println("[서버 종료]");
		}
	}
}
