package ch10.lecture.p04throws;

import java.io.FileReader;

public class C04Throws {
	public static void main(String[] args) throws Exception {
		method1();
	}
	
	private static void method1() throws Exception {
		FileReader a = new FileReader("a");
	}
}
