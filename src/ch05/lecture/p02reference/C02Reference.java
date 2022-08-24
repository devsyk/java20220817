package ch05.lecture.p02reference;

public class C02Reference {
	public static void main(String[] args) {
		int[] a = {3, 4, 5};
		int[] b = a;
		
		System.out.println(b[2]); //5
		
		a = new int[] {9, 8, 7};
		
		System.out.println(b[2]); //5
		
		
		
		System.out.println("===========");
		
		int[] c = {99,88,77};		
		changeItem(c); //{3,88,77}
		System.out.println(c[0]); //3

		int[] d = {7,6};
		changeItem(d); //{3,6}
		System.out.println(d[0]); //3
		
		
		
		System.out.println("===========");
		
		int[] x = {9, 8}; 
		changeItems1(x); //{9, 8}   << x 변경 안함

		System.out.println(x[0]); //9
		
		
		
		System.out.println("===========");
		
		int[] y = {9, 8, 7};
		System.out.println(y[0]); //9
		
		y = changeItems2(y); //{3,4,5}  << 배열 변경됨
		System.out.println(y[0]); //3
		
	}
	
	private static int[] changeItems2(int[] arr) {
		System.out.println(arr[0]); //9
		arr = new int[] {3,4,5}; //배열 변경
		return arr; //{3,4,5}  << 바뀐 배열로 return
	}
	
	public static void changeItems1(int[] arr) {
		System.out.println(arr[0]); //9
		arr = new int[] {3, 4}; // arr배열 변경됨   << return은 안함
	}
	
	private static void changeItem(int[] a) {
		a[0] = 3;
	}
}
