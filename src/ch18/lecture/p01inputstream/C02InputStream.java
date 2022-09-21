package ch18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class C02InputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/lecture/p01inputstream/C02InputStream.java";
		InputStream is = new FileInputStream(path);
		
		byte[] b = new byte[100];
		int len1 = is.read(b); //100
		int len2 = is.read(b); //100
		int len3 = is.read(b); //100
		int len4 = is.read(b); //100
		int len5 = is.read(b); //100
		int len6 = is.read(b); //100
		int len7 = is.read(b); //100
		int len8 = is.read(b); //100
		int len9 = is.read(b); //100
		int len10 = is.read(b); //100
		
		System.out.println(len1);
		System.out.println(len2);
		System.out.println(len3);
		
		System.out.println(len9);
		System.out.println(len10);
	}
}
