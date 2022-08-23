package ch04.lecture.p02method;

public class C07Overloading {
	public static void main(String[] args) {
		method1(3, 5);
		
		method2(9);
		method2();
		method2(3.14);
		
		method2(5);
		
		method2(3, 3.14);
		method2(3.14, 6);
		
		
		System.out.println("=================");
		
		double a = half(5.0);
		System.out.println(a); //2.5
		
		int b = half(5);
		System.out.println(b); //2
		
	}
	
	public static double half(double a) {
		return a / 2;
	}
	
	public static int half(int a) {
		return a / 2;
	}
	
	public static void method2(int a, double b) {
		System.out.println("INT DOUBLE");
	}
	
	public static void method2(double a, int b) {
		System.out.println("DOUBLE INT");
	}
	
	public static void method2(double a) {
		System.out.println("더블 타입 받는 메소드2");
	}
	
	public static void method2() {
		//메소드 overloading
		//메소드명이 같아도 파라미터의 타입, 개수, 순서가 다를 수 있음
		System.out.println("파라미터 없는 메소드2");
	}
	
	public static void method2(int a) {
		System.out.println("파라미터 있는 메소드2");
		
	}
	
	public static void method1(int a, int b) {
		
	}
		
}
