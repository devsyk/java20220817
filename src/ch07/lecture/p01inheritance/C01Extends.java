package ch07.lecture.p01inheritance;

public class C01Extends {
	public static void main(String[] args) {
		SuperClass1 o1 = new SuperClass1();
		SubClass1 o2 = new SubClass1();
		
		o1.age = 33;
		o1.method1();
		System.out.println(o1.age);

		o2.age = 44; //SuperClass1로부터 상속
		o2.name = "coyote";
		o2.method1(); //SuperClass1로부터 상속
		o2.method2();
		System.out.println(o2.age);
		System.out.println(o2.name);
		System.out.println(o2.name.getClass());
	}
}
