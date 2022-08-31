package ch07.lecture.p02polymorphism;

public class C08PolyMorphism {
	public static void main(String[] args) {
		String a = "maverick";
		
		System.out.println(a.length());
		
		Object b = "coyote"; //string은 object
		
//		System.out.println(b.length()); //object에는 length()메소드 없음
		
		String c = (String) b; //강제형변환
		System.out.println(c.length());
	}
}
