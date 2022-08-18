package ch03.book;

public class E05CharOperation {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
//		char c3 = c2 + 1; //int
		char c3 = (char) (c2 + 1); //char로 강제 형변환
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
	}
}
