package ch04.lecture.p02method;

public class C01Method {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		// call method (invoke method) : 메소드 호출
		method1();
		method1();
		
		System.out.println(4);
		
		method2();
		
		method1();
		System.out.println(5);
		System.out.println(6);
	}
	
	// 메소드(method)
	public static void method1() {
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
	}
	
	//메소드명 작성 규칙 : 영문대소문자, 숫자, $, _ 사용 (숫자 앞에 오면 안됨)
	//   - lowerCamelCase
	public static void method2() {
		System.out.println("==============");
	}
}
