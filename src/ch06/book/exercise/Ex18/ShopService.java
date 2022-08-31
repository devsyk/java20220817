package ch06.book.exercise.Ex18;

public class ShopService {
	private static ShopService ins;
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		if(ins == null) {
			ins = new ShopService(); //null일때 객체 생성
		}
		return ins;
	}
}
