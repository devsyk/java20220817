package ch18.lecture.p06filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class C06Filter {
	public static void main(String[] args) {
		String name = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		
		try(
			InputStream is = new FileInputStream(name);				
			Reader rd = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(rd);				
				) {
			
			String line = null;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);			
			}
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
