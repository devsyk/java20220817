package ch18.lecture.p06filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class C07Filter {
	public static void main(String[] args) {
		
		// output12.txt 읽어오기
		String path = "C:\\Users\\user\\Desktop\\output\\output12.txt";				
		// output13.txt에 복사
		String name = "C:\\Users\\user\\Desktop\\output\\output13.txt";
		
		try (
				
			InputStream is = new FileInputStream(path);				
			Reader rd = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(rd);	
			
			OutputStream os = new FileOutputStream(name);
			Writer wr = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(wr);
				
				) {
			
			char[] cbuff = new char[100];
			int len = 0;
			
			while ((len = br.read(cbuff)) != -1) {
				bw.write(cbuff, 0, len);		
			}
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		
	}
}
