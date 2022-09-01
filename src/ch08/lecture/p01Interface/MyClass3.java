package ch08.lecture.p01Interface;

//public abstract class MyClass3 implements MyInterface3 { //MyInterface3가 추상메소드를 가지고 있어서 abstract class
//
//}

public class MyClass3 implements MyInterface3 {

	@Override
	public void method1() {
		System.out.println("myclass3 method1");
	}

	@Override
	public void method2() {
		System.out.println("myclass3 method2");
	}

	@Override
	public void method3() {
		System.out.println("myclass3 method3");
	}

	@Override
	public void method4() {
		System.out.println("myclass3 method4");
	}
	
}
