package ch04.lecture.p02method;

public class C02Parameter {
	public static void main(String[] args) {
		System.out.println(1);
		method1(); //파라미터 없는 메소드
		System.out.println(2);
		
//		method2(3.14); // X 
//		method2("Hi"); // X 
		method2(10); 
		
		System.out.println(3);
		
		method2(3); 
		
		
		printTriangle(3);
		printTriangle(10);
		
	}
	
	public static void method1() {
		System.out.println("메소드1 실행");
	}
	
	public static void method2(int a) {
		// 메소드 파라미터(인자, 매개변수)
		// ()안에 타입과 파라미터명 나열
		System.out.println("메소드2 실행");
		System.out.println("a = " + a);
	}
	
	public static void printTriangle(int num) {
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
