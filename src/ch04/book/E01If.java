package ch04.book;

public class E01If {
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90) //false
			System.out.println("점수가 90보다 작습니다."); //출력X
			System.out.println("등급은 B입니다.");	//if문 안에 없음	
	}
}
