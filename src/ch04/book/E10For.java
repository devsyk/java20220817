package ch04.book;

public class E10For {
	public static void main(String[] args) {
		//1부터 10까지 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}		
		System.out.println("==============");
		
		//1부터 5까지 출력
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}		
		System.out.println("==============");
		//5부터 10까지 출력
		for(int i = 5; i <= 10; i++) {
			System.out.println(i);
		}		
		System.out.println("==============");
		//5부터 1까지 출력
		for(int i = 5; i >= 1; i--) {
			System.out.println(i);
		}		
		System.out.println("==============");
		//10부터 5까지 출력
		for(int i = 10; i >= 5; i--) {
			System.out.println(i);
		}		
		System.out.println("==============");
		
		
		//1부터 100까지 합 출력
		int sum = 0;

		for(int j = 1; j <= 100; j++) {
			sum = sum + j;
		}
		System.out.println("1~100 합: " + sum);
		System.out.println("==============");
		
		sum = 0;
		int j = 0; //for문 코드블럭 밖에 선언 > for문 밖에서도 j 사용가능
		for(j=1; j<=100; j++) {
			sum += j;
		}
		System.out.println("1~" + (j-1) + " 합: " + sum);
	}
}
