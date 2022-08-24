package ch05.lecture.p01array;

public class C02Array {
	public static void main(String[] args) {
		int[] arr1 = {100,200,300};
		int[] arr2 = {9,8};
		int[] arr3 = {2};
		int[] arr4 = {};
		
		printLength(arr1);
		printLength(arr2);
		printLength(arr3);
		printLength(arr4);
		printLength(new int[] {9,8,7,6,5});
		
		System.out.println("=================");
		
		int[] arr5 = {9,8};
		int[] arr6 = {100,50};
		int[] arr7 = {99,100,101};
		
		printFirstItem(arr5); //9
		printFirstItem(arr6); //100
		printFirstItem(arr7); //99
		printFirstItem(new int[] {10000}); //10000
		System.out.println("--------");
		
		printLastItem(arr5); //9
		printLastItem(arr6); //50
		printLastItem(arr7); //101
		printLastItem(new int[] {-1}); //-1
		System.out.println("--------");
		
		printMidItem(arr5); //8
		printMidItem(arr6); //50
		printMidItem(arr7); //100
		printMidItem(new int[] {5,6,7,8,9}); //7
		printMidItem(new int[] {100,200,300,400}); //300
		
		System.out.println("=================");
		
		int[] arr8 = {-5,-4,-3};
		int[] arr9 = {4,5,6,7};
		int[] arr10 = {300,200,100,50,40};
		
		int s1 = sumFirtstLast(arr8);
		System.out.println(s1); //-8
		int s2 = sumFirtstLast(arr9);
		System.out.println(s2); //11
		int s3 = sumFirtstLast(arr10);
		System.out.println(s3); //340
		int s4 = sumFirtstLast(new int[] {9,8});
		System.out.println(s4);//17
		System.out.println(sumFirtstLast(new int[] {8,7,6,5})); //13
		System.out.println(sumFirtstLast(new int[] {1000})); //2000
		
	}
	
	public static void printLength(int[] arr) {
		System.out.println(arr.length);
	}
	
	private static void printFirstItem(int[] arr) {
		System.out.println(arr[0]);
	}
	
	private static void printLastItem(int[] arr) {
		System.out.println(arr[arr.length-1]);
	}
	
	private static void printMidItem(int[] arr) {
		int mid = (int)arr.length/2;
		System.out.println(arr[mid]);
	}
	
	private static int sumFirtstLast(int[] arr) {
		return arr[0] + arr[arr.length-1];
	}
}
