package ch08.book.s080506;

import ch08.book.s080504.Vehicle;
import ch08.book.s080505.Bus;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { //vehicle 매개변수가 참조하는 객체가 Bus인지 확인
			Bus bus = (Bus) vehicle; //Bus 객체일 경우 안전하게 강제 타입 변환
			bus.checkFare(); //Bus타입으로 강제 타입 변환하는 이유
		}
		vehicle.run();
	}
}
