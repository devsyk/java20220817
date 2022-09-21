package ch18.book;

import java.io.FileInputStream;
import java.io.IOException;

public class E01FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/ch18/book/E01FileInputStreamExample.java");
			
			int data;
			while( (data = fis.read()) != -1 ) {
				System.out.write(data);
			}
			
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
