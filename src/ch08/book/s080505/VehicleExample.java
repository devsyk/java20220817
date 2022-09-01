package ch08.book.s080505;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); //Vehicle 인터페이스에는 checkFare() 없음
		
		Bus bus = (Bus) vehicle; //강제형변환
		
		bus.run();
		bus.checkFare(); //Bus 클래스에는 checkFare() 있음
		
	}
}
