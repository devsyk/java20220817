package ch10.lecture.p05throw;

public class C02Throw {
	public static void main(String[] args) {
		try {
			method1();
			
		} catch (Exception e) {
			System.out.println("일반예외 catch");
		}
	}

	private static void method1() throws Exception {
		System.out.println("코드1");
		System.out.println("코드2");
		
		//예외 발생
		//throw Exception
		throw new Exception();
	}
}
