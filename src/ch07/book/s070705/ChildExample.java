package ch07.book.s070705;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child(); //자동형변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";
//		parent.method3();
		
		Child child = (Child) parent; //강제형변환
		child.field2 = "yyy";
		child.method3();
	}
}
