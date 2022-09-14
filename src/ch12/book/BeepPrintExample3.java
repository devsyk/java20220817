package ch12.book;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++) {
				toolkit.beep();
				try { Thread.sleep(500); } catch (Exception e) {}
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 5; i++) {
				System.out.println("띵");
				try { Thread.sleep(500); } catch (Exception e) {}
			}
		});
		
		t1.start();
		t2.start();
	}
}
