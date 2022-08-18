package ch03.lecture.p1unary;

public class C03Not {
	public static void main(String[] args) {
		/*
		 * 논리부정연산자 (not)
		 * ! 
		 * 피연산자 boolean 
		 * 연산결과 boolean, 피연산자를 반대값으로
		 */
		boolean a = true;
		boolean b = false;
		
		boolean c = !a;
		boolean d = !b;
		
		System.out.println(c); //false
		System.out.println(d); //true
		
		System.out.println(!c); //true
		System.out.println(!d); //false
		
	}
}
