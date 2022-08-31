package ch07.book.s0703;

public class Student extends People {
	private int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //상위클래스 생성자 실행
		this.studentNo = studentNo;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
}
