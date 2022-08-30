package ch06.lecture.p04Static;

public class MyClass3 {
	// instance field
	String name;
	
	// static field
	static String company = "topgun";
	
	public MyClass3(String name) {
		this.name = name;
	}
	
	// static method
	static void printCompany() {
		// static member에서 instance member 접근 가능
//		System.out.println(this.company); // X
		System.out.println(company);
	}
		
	// instance method
	void printName() {
		System.out.println(this.name);
	}
	
	void showCompany() {
		// instance member에서 static member 접근 가능
		System.out.println(company);
	}
	
	void someInstanceMethod() {
		// this는 instance member 접근 시 사용 가능
		System.out.println(this.name);
		this.printName();
		printName();
	}	
}
