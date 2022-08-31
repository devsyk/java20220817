package ch07.book.exercise.Ex07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run(); //실제 인스턴스는 SnowTire
	}
}
