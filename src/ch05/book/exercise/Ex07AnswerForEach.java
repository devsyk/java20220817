package ch05.book.exercise;

public class Ex07AnswerForEach {
	public static void main(String[] args) {
		//Q. 배열의 최댓값 구하기 (for문)
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};

//		for (int i = 0; i < array.length; i++) {
//			if (max < array[i]) {
//				max = array[i];
//			}
//		}
		for (int item : array) {
			if (max < item) {
				max = item;
			}
		}
		System.out.println("max: " + max); //8
		
		//최소값 구하기
		int min = Integer.MAX_VALUE;
//		for (int i = 0; i < array.length; i++) {
//			if (min > array[i]) {
//				min = array[i];
//			}
//		}	
		for (int item : array) {
			if (min > item) {
				min = item;
			}
		}	
		System.out.println("min: " + min); //1
	}
}
