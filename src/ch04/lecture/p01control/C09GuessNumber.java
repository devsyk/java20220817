package ch04.lecture.p01control;

import java.util.Scanner;

public class C09GuessNumber {
	public static void main(String[] args) {
		
		//1~100 random	
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int answer = (int)(Math.random()*100) +1;		
		
		while(true) {
			System.out.print("1~100 사이의 정수를 입력해주세요. >");
			num = scanner.nextInt();
			
			if(num > answer) {
				System.out.println("더 작은 수 입니다.");
			} else if(num < answer) {
				System.out.println("더 큰 수 입니다.");
			} else {
				System.out.println("정답입니다.");
				break;
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
		

	}
}
