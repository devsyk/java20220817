package ch03.book;

public class E03DenyLogicOperator {
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play); //false
		
		play = !play;
		System.out.println(play); //true
	}
}
