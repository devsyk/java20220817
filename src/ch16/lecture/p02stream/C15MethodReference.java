package ch16.lecture.p02stream;

import java.util.Arrays;

public class C15MethodReference {
	public static void main(String[] args) {
		String[] arr1 = { "iron", "cap", "widow", "hulk", "panther" };
		
		System.out.println(Arrays.toString(arr1));
//		Arrays.sort(arr1, (a,b) -> a.compareTo(b));
		Arrays.sort(arr1, String :: compareTo); // method reference
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr1, (a,b) -> b.compareTo(a));
		//Arrays.sort(arr1, String :: compareTo); //파라미터 순서와 메소드가 같을 경우만 사용 가능
		
	}
}
