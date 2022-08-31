package ch07.book.s070704;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //Vehicle vehicle = bus; - bus의 run()메소드 실행
		driver.drive(taxi); //Vehicle vehicle = taxi; - taxi의 run()메소드 실행
	}
}
