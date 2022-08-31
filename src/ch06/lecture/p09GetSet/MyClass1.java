package ch06.lecture.p09GetSet;

public class MyClass1 {
	private int age; //private으로 접근 막음
	
	// getter
	public int getAge() {
		return age;
	}
	
	// setter
	public void setAge(int age) {
		if(age >= 0) { //유효한 값만 저장되도록 매개값 검증
			this.age = age;			
		}
	}
}
