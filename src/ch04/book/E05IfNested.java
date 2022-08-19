package ch04.book;

public class E05IfNested {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 20) + 81; //81 ~ 100 사이의 점수
		System.out.println("점수: " + score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);
	}
}
