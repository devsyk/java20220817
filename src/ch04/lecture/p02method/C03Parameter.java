package ch04.lecture.p02method;

public class C03Parameter {
	public static void main(String[] args) {
		method1(3);
		method2(3.14);
		method2(5);
//		method1(3.14); // X
//		method1("3.14"); // X
		
		int a = 3;
		method2(a);
		
		double b = 3.14;
		method2(b);		
		
//		method3(1);
//		method3(2,1);
		method3(3,2,1);
		
				
		sum(1, 10); // 1~10사이 정수의 합
		sum(1, 100); // 1~100사이 정수의 합
		sum(50, 200); // 50~200사이 정수의 합
		
	}
	
	public static void method1(int p1) {
		
	}
	
	public static void method2(double param) {
		
	}
	
	public static void method3(int p1, int p2, int p3) {
		
	}
	
	public static void sum(int start, int end) {
		long sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(start + "~" + end + " 사이 정수의 합 : " + sum);		
	}
	
	
	
}
