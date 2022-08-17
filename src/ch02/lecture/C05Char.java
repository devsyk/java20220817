package ch02.lecture;

public class C05Char {
	public static void main(String[] args) {
		//char : 2 byte
		// 하나의 문자 표현용
		
		char a;
		a = '가';	// 문자 하나는 작은 따옴표 사용
		
		char b = 'A';
		char c = 'a';
		char d = ' ';	
//		char e = '';	//빈문자는 없음 (but 빈문자열은 있음)
		String f = "";	// OK
		
		char g = 65;
		System.out.println(g);
	}
}
