package ch05.lecture.p01array;

public class C03Array {
	public static void main(String[] args) {
		int[] a = {4, 5, 6};
		int[][] b; // 각 아이템의 type이 int[]
		b = new int[][] {{1, 2}, {100, 200}, {5, 6}};

		System.out.println(b[0][0]); // 1
		System.out.println(b[0][1]); // 2
		System.out.println(b[1][0]); // 100
		System.out.println(b[1][1]); // 200
		System.out.println(b[2][0]); // 5
		System.out.println(b[2][1]); // 6
		
		
		int[][] c = {{3,4,5},{1,2,3}};
		int[][] d = new int[2][3];
		int[][] e = new int[3][]; //null, null
		
		System.out.println(d[0][0]);
		System.out.println(d[0][1]);
		System.out.println(d[0][2]);
		
		d[0][0] = 9;
		d[0][1] = 8;
		d[0][2] = 99;
		
		e[0] = new int[] {99, 88};
		System.out.println(e[0][0]);
		System.out.println(e[0][1]);
		
		e[1] = new int[] {200, 100};
		System.out.println(e[1][0]);
		System.out.println(e[1][1]);
		
		e[2] = new int[] {-1, -2};
		System.out.println(e[2][0]);
		System.out.println(e[2][1]);
	}
}
