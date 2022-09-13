package ch13.book.s1302;

public class BoxExample {
	public static void main(String[] args) {
		/*Box box = new Box();
		
		box.set("홍길동"); //String → Object (자동형변환)
		String name = (String) box.get(); //Object → String (강제형변환)
		
		box.set(new Apple()); //Apple → Object (자동형변환)
		Apple apple = (Apple)box.get(); //Object → Apple (강제형변환)*/
		
		//generic 사용
		Box<String> box = new Box<String>();
		box.set("hello");
		String str = box.get();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();

		Box<Apple> box3 = new Box<Apple>();
		box3.set(new Apple());
		Apple a = box3.get();
		
	}
}
