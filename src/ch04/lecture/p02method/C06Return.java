package ch04.lecture.p02method;

public class C06Return {
	public static void main(String[] args) {
		long a = sum(1, 10);
		System.out.println(a); // 1~10 정수의 합
		
		long b = sum(1, 100);
		System.out.println(b); // 1~100 정수의 합
		
		long c = sum(50, 200);
		System.out.println(c); // 50~200 정수의 합
		
		System.out.println("===============");
		
		int d = max(3, 5);
		System.out.println(d); // 5

		int e = max(5, 3);
		System.out.println(e); // 5

		int f = max(-100, 100);
		System.out.println(f); // 100

		int g = max(100, 200);
		System.out.println(g); // 200
	}
	
	public static long sum(int start, int end) {		
		long total = 0;
		
		for(int i = start; i <= end; i++) {
			total += i;
		}
		return total;				
	}
	
	public static int max(int a, int b) {		
		
		int num = (a >= b) ? a : b;		
		return num;				
	}		
	
	
	
}
