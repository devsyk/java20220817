package ch06.book.exercise.Ex14;

public class Main {
	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("김자바", "java");
		
		System.out.println("name : " + user1.name + "  id : " + user1.id);
		System.out.println("name : " + user2.name + "  id : " + user2.id);
	}
}
