package ch06.book.s061302.package1;

public class A {
	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//생성자
	public A(boolean b) {} 	//public
	A(int a) {}				//default
	private A(String s) {}	//private
}
