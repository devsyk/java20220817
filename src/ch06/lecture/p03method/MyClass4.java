package ch06.lecture.p03method;

public class MyClass4 {
	
	//메소드 리턴 타입 : 메소드 내에서 반환하는 값의 타입
	//단, void는 리턴값이 없음
	void method1() {	
		//return : 메소드 종료, 값 반환
		return; //종료, 반환X
	}
	
	int method2() {
		
		return 3;
	}
	
	int method3() {
		
		return 5;
	}
	
	int method4() {
		int a = 3;
		if(a == 3) {			
			return 10;
		}
		return 3;
	}
}
