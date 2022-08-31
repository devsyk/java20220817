package ch07.lecture.p02polymorphism;

import java.util.Scanner;

public class C04PolyMorphism {
	public static void main(String[] args) {
		
	}
	
	public static String method1() {
		
		return "";
	}
	
	public static Scanner method2() {
		
		return new Scanner("");
	}
	
	public static Object mehtod3() {
		
		return new Object();
	}
	
	public static Object method4() {
		
		return ""; //string은 object이다
	}
	
	public static Object method5() {
		
		return new Scanner(""); //scanner는 object이다
	}
	
	public static Object method6() {
		String s = "java";
		return s; //string은 object이다
	} 
	
	public static Object method7() {
		Scanner s = new Scanner("");
		return s; //scanner는 object이다
	}
}
