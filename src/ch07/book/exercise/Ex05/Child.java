package ch07.book.exercise.Ex05;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name); //부모클래스 생성자 호출
		//this.name = name;
		this.studentNo = studentNo;
	}
}
