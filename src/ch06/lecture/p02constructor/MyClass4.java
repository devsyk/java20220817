package ch06.lecture.p02constructor;

public class MyClass4 {
	//필드
	String name;
	int age;
	
	//생성자
	public MyClass4(String name, int age) {
		// this : 앞으로 만들어질 객체의 참조값
//		name = name;
//		age = age;
		this.name = name;
		this.age = age;
	}
}
