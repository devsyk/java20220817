package ch10.lecture.p04throws;

public class C01Throws {
	public static void main(String[] args) throws ClassNotFoundException {
		method1();
	}
	
	public static void method1() throws ClassNotFoundException {
		Class.forName("java.lang.String");
	}
}
