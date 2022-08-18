package ch02.lecture;

public class C11String {
	public static void main(String[] args) {
		/*
		 * String : 문자열 
		 * char : 문자
		 */
		char a = '뀗'; // 작은 따옴표
		String b = "java"; //큰 따옴표
//		char c = ''; // char는 빈문자열 X
		String d = ""; //String은 빈문자열 O
		
		
		/*
		 * 연결연산(+)의 결과 
		 * => String
		 */
		String e = "hello";
		char f = '!';
		String g = e + f;
		System.out.println(g);
		
		String h = e + 100;
		System.out.println(h);
		
		String i = e + 3.14;
		System.out.println(i);
		
		String j = e + true;
		System.out.println(j);
		
		String k = e + "world";
		System.out.println(k);
		
		
		/*
		 * 참조타입 (객체) 
		 * : 필드와 메소드가 있음
		 */
		String l = "bts";
		
		/* charAt(int index) : index번째 문자 리턴 */
		char m = l.charAt(0); 
		int n = l.charAt(0); //유니코드
		
		char o = l.charAt(0); //'b'
		char p = l.charAt(1); //'t'
		char q = l.charAt(2); //'s'
		
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);
		
//		l.charAt(-1); 	//IndexOutOfBoundsException 발생
//		l.charAt(3); 	//  - String index out of range
		
		/* length() : 길이 리턴 */
		int r =l.length();
		System.out.println(r); //3
		
		String s = "javascript";
		System.out.println(s.length());
		
		System.out.println("hello world".length());
		System.out.println("".length());
		System.out.println(s.charAt(s.length()-1)); //마지막 문자 출력
		
		/* substring(index) : index번째 문자열 부터 끝까지 리턴 */
		String t = s.substring(0);
		System.out.println(t);
		System.out.println(s.substring(1));
		System.out.println(s.substring(2));
		System.out.println(s.substring(3));
		System.out.println(s.substring(4));
		System.out.println(s.substring(5));
		System.out.println(s.substring(6));
		System.out.println(s.substring(7));
		System.out.println(s.substring(8));
		System.out.println(s.substring(9));
		System.out.println(s.substring(10));
		/* substring(index1, index2) : index1부터 index2 전까지 리턴 */
		System.out.println(s.substring(0, 9));
		System.out.println(s.substring(0, 10));
		System.out.println(s.substring(0, 4)); // "java"
		System.out.println(s.substring(2, 4)); // "va"
		
		
		String u = "javascript";
		String v = "vscode";
		
		String w = u.substring(0, 4);
		String x = v.substring(2, 6);
		
		System.out.println(w + x); //"javacode"
	}
}
