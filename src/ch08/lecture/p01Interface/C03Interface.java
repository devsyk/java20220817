package ch08.lecture.p01Interface;

public class C03Interface {
	public static void main(String[] args) {
		MyInterface3 o1 = new MyClass3();
		MyInterface3 o2 = new MyClass4();
		
		o1.method1(); //재정의된 인스턴스의 메소드 실행
		o1.method2();
		o1.method3();
		o1.method4();
		
		o2.method1();
		o2.method2();
		o2.method3();
		o2.method4();
		
		System.out.println("======= 메소드 호출");
		method1(o1);
		method1(o2);
		
	}
	
	public static void method1(MyInterface3 o) {
		o.method1();
		o.method2();
		o.method3();
		o.method4();
	}
}
