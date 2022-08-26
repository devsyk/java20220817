package ch06.lecture.p02constructor;

public class MyClass1 {
	//fields
	String name;
	
	//생성자 costructor
	//생성자명 : == 클래스명
	//() : 파라미터 목록
	//{} : 실행코드
	public MyClass1() {
		System.out.println("파라미터 없는 생성자 실행");
	}
	
	//생성자는 파라미터 타입, 개수, 순서를 구분해서 여러개 만들수 있음
	public MyClass1(String n) {
		System.out.println("String 파라미터 하나 받는 생성자 실행");
		name = n;
	}
}
