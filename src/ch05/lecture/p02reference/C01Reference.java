package ch05.lecture.p02reference;

public class C01Reference {
	public static void main(String[] args) {
		//기본타입 primitive type
		//참조타입 referece type
		int x;
		x = 3;
		
		int[] arr;
		arr = new int[] {7,8,9};
		
		
		int[] a = {3, 4, 5};
		int[] b = {99, 100, 101};

		a[0] = 33;

		System.out.println(a[0]);

		int[] c = a;

		System.out.println(c[0]);

		c[2] = 1000;

		System.out.println(a[2]); //1000
		
	}
}
