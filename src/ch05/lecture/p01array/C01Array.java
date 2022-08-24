package ch05.lecture.p01array;

public class C01Array {
	public static void main(String[] args) {
		// array : 여러 값을 저장하는 공간
		// 타입[]
		int[] arr1; //arr1배열이 저장하는 값의 타입은 int
		double[] arr2;
		String[] arr3;
		
		int[] arr4; //선언
		arr4 = new int[5]; //int 값 5개 저장할 공간 생성
		
		arr4[0] = 10; //index 활용해서 값 저장
		arr4[1] = 11;
		arr4[2] = 99;
		arr4[3] = 100;
		arr4[4] = 200;
//		arr4[5] = 300; //5번 index 없음
		
		System.out.println(arr4[4]);
		System.out.println(arr4[3]);
		System.out.println(arr4[2]);
		System.out.println(arr4[1]);
		System.out.println(arr4[0]);
		
		int a = arr4[4];
		System.out.println(a);
		
		int[] arr5 = new int[] {9, 8, 7};
		System.out.println(arr5[0]);
		System.out.println(arr5[1]);
		System.out.println(arr5[2]);
		
		int[] arr6 = {1,2,3,4,5,60};
		System.out.println(arr6.length); //6
		System.out.println(arr6[arr6.length-1]); //배열의 마지막 값 : 60
	}
}
