package ch06.lecture.p04Static;

public class MyClass1 {
	// non static
	// instance field
	String name;
	
	// static field
	// class field
	static String company;
	
	// 생성자
	public MyClass1(String name) {
		this.name = name;
	}
	
	// non static
	void printName() {
		System.out.println(name);
	}
}
