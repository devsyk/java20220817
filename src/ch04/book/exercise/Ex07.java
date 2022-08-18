package ch04.book.exercise;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		/*
		 * Q. 입력된 데이터로 예금 출금, 조회, 종료 기능 제공 코드 
		 * - while문, Scanner 이용
		 */		
		boolean run = true;		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.println("선택> ");

		}
		System.out.println("프로그램 종료");
	}
}
