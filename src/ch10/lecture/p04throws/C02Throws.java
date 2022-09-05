package ch10.lecture.p04throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C02Throws {
	public static void main(String[] args) throws FileNotFoundException {

		method1();
	}
	
	private static void method1() throws FileNotFoundException {
		InputStream is = new FileInputStream("");
	}
}
