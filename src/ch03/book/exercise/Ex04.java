package ch03.book.exercise;

public class Ex04 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		//학생 한명이 가지는 연필 수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		//남은 연필의 수 
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}
}
