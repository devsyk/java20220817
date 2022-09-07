package ch11.lecture.p01object;

//extends Object 생략 가능
public class C03Equals {
	public static void main(String[] args) {
		System.out.println("Object equals()");
		Object b1 = new Book();
		Object b2 = new Book();
		
		System.out.println(b1.equals(b2)); //false > true
		System.out.println(b2.equals(b1)); //false > true
		System.out.println(b1.equals(b1)); //true
		System.out.println(b2.equals(b2)); //true
		
		System.out.println("Book equals()");
		Object b3 = new Book(333);
		Object b4 = new Book(333);
		Object b5 = new Book(777);
		
		System.out.println(System.identityHashCode(b3));
		System.out.println(System.identityHashCode(b4));
		System.out.println(System.identityHashCode(b5));
		
		System.out.println(b3.equals(b4)); //true
		System.out.println(b4.equals(b3)); //true
		
		System.out.println(b3.equals(b5)); //false
		System.out.println(b5.equals(b3)); //false

	}
}

class Book extends Object {
	private int code;
	
	Book() {
		
	}
	
	Book(int code) {
		this.code = code;
	}
	
	@Override //재정의
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book o = (Book) obj;
			
			if(obj != null) { //nullPointException 방지
				return this.code == o.code;				
			}
		}
		return false;
	}
	
	@Override //equals() 재정의 했으면 hashcode()도 재정의 해야함
	public int hashCode() {
		return code * 31;
	}
}