package ch06.lecture.p10annotation;

@MyAnnotation3
public class C03Target {
	
	@MyAnnotation3
	private int i;

	@MyAnnotation3
	public C03Target() {

	}

	@MyAnnotation3
	public void method(@MyAnnotation3 int i) {
		@MyAnnotation3
		int j;

	}
}
