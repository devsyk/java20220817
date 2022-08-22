package ch04.book.exercise;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		/*
		 * Q. 입력된 데이터로 예금 출금, 조회, 종료 기능 제공 코드 
		 * - while문, Scanner 이용
		 */		
		boolean run = true;		
		int balance = 0; //잔고
		int deposit = 0; //예금액
		int withdraw = 0; //출금액
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			
			String inputString;
			inputString = scanner.nextLine(); //키보드로 입력한 문자열 변수저장			
			
			//문자열 비교 : equals() 사용!!
			if(inputString.equals("1")) {				
				System.out.print("예금액> ");
				
				String val1 = scanner.nextLine();
				deposit += Integer.parseInt(val1);
				
			} else if(inputString.equals("2")) {				
				System.out.print("출금액> ");
				
				String val2 = scanner.nextLine();
				withdraw += Integer.parseInt(val2);
				
			} else if(inputString.equals("3")) {
				balance = deposit - withdraw;
				
				System.out.println("잔고> " + balance);
				
			} else if(inputString.equals("4")) {
				run = false; //for문 종료
			}

		}
		System.out.println();
		System.out.println("프로그램 종료");
	}
}
