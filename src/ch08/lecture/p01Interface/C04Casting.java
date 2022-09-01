package ch08.lecture.p01Interface;

import java.io.Serializable;

public class C04Casting {
	public static void main(String[] args) {
		CharSequence o1 = "topgun";
		int len = o1.length();
		char c = o1.charAt(3);
		
		String o2 = (String) o1;
		
		byte[] bytes = o2.getBytes();
		
		Object o3 = (Object) o1;
		Serializable o4 = (Serializable) o1;
		
		
	}
}
