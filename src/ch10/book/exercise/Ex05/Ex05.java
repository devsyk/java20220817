package ch10.book.exercise.Ex05;

public class Ex05 {
	public void method1() throws NumberFormatException, ClassNotFoundException {
		
	}
	
	//1번
	public void method2() {
		try {
			method1();
		} catch (Exception e) {

		}
	}
	
	//2번
	public void method3() throws Exception {
		method1();
	}
	
	//3번
//	public void method4() {
//		try {
//			method1();
//		} catch(Exception e) {
//			
//		} catch(ClassNotFoundException e) {
//			
//		}
//	}
	
	//4번
	public void method5() {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			
		} catch (NumberFormatException e) {

		}
	}
	
}
