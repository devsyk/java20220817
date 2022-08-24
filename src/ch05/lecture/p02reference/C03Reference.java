package ch05.lecture.p02reference;

import java.util.Arrays;

public class C03Reference {
	public static void main(String[] args) {
		int[][] a = {{5, 4}, {100, 200}, {9}};

		System.out.println(Arrays.deepToString(a));

		int[][] b = a;

		System.out.println(Arrays.deepToString(b));

		a[0][0] = 55;

		System.out.println(b[0][0]); // 55

		a[0] = new int[] {7, 5}; //배열 안 배열을 변경 <<객체를 변경한건 아님
		System.out.println(a[0][0]); // 7
		System.out.println(b[0][0]); // 7
		
		a = new int[][] {{1,2},{3,4},{5,6}};
		System.out.println(a[0][0]); // 1
		System.out.println(b[0][0]); // 7
		
	}
}
