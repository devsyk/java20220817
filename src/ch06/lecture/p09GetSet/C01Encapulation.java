package ch06.lecture.p09GetSet;

public class C01Encapulation {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
//		o1.age = 30; 				//private이어서 접근 불가
//		System.out.println(o1.age);
//		
//		o1.age = -30;
//		ystem.out.println(o1.age);
		
		o1.setAge(30); //setter 메소드 통해 저장
		System.out.println(o1.getAge()); //getter 메소드 통해 전달 받음
		o1.setAge(-30);
		System.out.println(o1.getAge());
		
	}
}
