package ch12.book;

public class ThreadB extends Thread {
	public ThreadB() {
		setName("ThreadB"); // 스레드 이름 설정
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
