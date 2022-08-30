package ch06.book.exercise.Ex15;

public class MemberService {
	boolean login(String id, String password) {
		return id.contentEquals("hong") && password.contentEquals("12345");
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
