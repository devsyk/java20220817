package ch03.lecture.p2binary;

public class C07Logical {
	public static void main(String[] args) {
		/* 
		 * 논리연산자
		 * and : &&, &
		 * or : ||, |
		 * xor : ^
		 * not : !
		 * 피연산자 : boolean 
		 * 결과 : boolean
		 */
		// and : 둘다 true일 때만 true
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		System.out.println(false && false); //false
		
		// or : 둘다 false일 때만 false
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		System.out.println(false || true); //true
		System.out.println(false || false); //false
		
		//xor : 다를때만 true
		System.out.println(true ^ true); //false
		System.out.println(true ^ false); //true
		System.out.println(false ^ true); //true
		System.out.println(false ^ false); //false
	}
}
