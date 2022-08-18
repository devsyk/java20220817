package ch03.book.exercise;

public class Ex02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); //11 + 20 (x=11, y=19)
		System.out.println(z); //31
	}
}
