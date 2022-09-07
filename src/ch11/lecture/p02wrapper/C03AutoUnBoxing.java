package ch11.lecture.p02wrapper;

public class C03AutoUnBoxing {
	public static void main(String[] args) {
		Integer a = 99;
		
		//참조타입을 기본타입으로 변경(unboxing)
		int b = a.intValue();
		
		//참조타입을 기본타입으로 자동변경(autoUnboxing)
		int c = a; //OK
		
		Object d = 99;
//		Integer e = d; //상위타입은 하위타입 X
//		int f = d;
		int g = (Integer) d;

		Object[] arr = {"java", 3, 3.14};
		String s = (String) arr[0]; // Object는 String이다 X >> 강제 형변환 필요
		Integer i = (Integer) arr[1];
		double j = (Double) arr[2];
		
		double k = (double) arr[2];
		
		System.out.println("프로그램 실행 이어감");
	}
}
