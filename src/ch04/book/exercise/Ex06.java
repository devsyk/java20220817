package ch04.book.exercise;

public class Ex06 {
	public static void main(String[] args) {
		
		/*
		 *  Q. for문 이용해서 삼각형 출력
		 *  
		 */		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");	//줄바꿈 안함			
			}			
			System.out.println(); //줄바꿈
		}		
						
//		for(int i = 1; i <= 5; i++) {
//			String result = "*".repeat(i);
//			System.out.println(result);
//		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < (5-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i = 5; i >= 1; i--) {
//			for(int j = i; j >=  1; j--) {
//				System.out.print("*");	
//			}			
//			System.out.println(); 
//		}
		
	}
}
