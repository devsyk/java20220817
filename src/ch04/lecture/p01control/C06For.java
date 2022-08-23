package ch04.lecture.p01control;

public class C06For {
	public static void main(String[] args) {

		System.out.println(1);
		
		//실행흐름 : 1 > 2 - true > 3 > 4 > 2 (반복)
		// 				   - false > for문 종료
		for(int i = 1; //1. 초기화식
			i <= 3; //2. 조건식 
			i++	//4. 증감식
				) {
			//3. 실행문(코드블럭)
			System.out.println(2);
			System.out.println(3);			
		}
		
		System.out.println(4);
		
		
		System.out.println("===============");
		
		//01234 5번 출력
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("----------------");
		//12345 5번 출력
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("----------------");
		//54321 5번 출력
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("----------------");
		//43210 5번 출력
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >= 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("----------------");
		//0부터 순차적으로 01234까지 출력
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("----------------");
		//1부터 순차적으로 12345까지 출력
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		System.out.println("----------------");
		//0부터 순차적으로 6789까지 출력 ************************
		int k = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		System.out.println("----------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------");
		int l = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
//				System.out.print(l);
//				l++;
//				l %= 10;
				System.out.print((l++)%10);
			}
			System.out.println();
		}
	}
}
