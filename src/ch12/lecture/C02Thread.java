package ch12.lecture;

import java.awt.Toolkit;

public class C02Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Task1());
		Thread t2 = new Thread(new Task2());
	
		t1.start();
		t2.start();
	}
}

class Task2 implements Runnable {
	@Override
	public void run() {
		// 소리 출력
		Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			
			// 실행 잠시 멈춤
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}	
}

class Task1 implements Runnable {
	@Override
	public void run() {
		// 문자 출력
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			
			// 실행 잠시 멈춤
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}	
}
