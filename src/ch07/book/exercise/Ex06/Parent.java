package ch07.book.exercise.Ex06;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		//부모클래스 생성자 호출(생략되어있음)
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
