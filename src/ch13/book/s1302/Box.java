package ch13.book.s1302;


/*public class Box {
	private Object object;
	public void set(Object object) {this.object = object;}
	public Object get() {return object;}
}*/

//generic 사용
public class Box<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

}
