package ch11.lecture.p02wrapper;

public class C04NullValue {
	public static void main(String[] args) {
		int a = 3;
		Integer b = 3;
		
//		int d = null;
		Integer c = null; //참조타입만 null 가능
		
		int e = c; //runTime exception
	}
}
