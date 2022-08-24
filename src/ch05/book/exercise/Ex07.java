package ch05.book.exercise;

public class Ex07 {
	public static void main(String[] args) {
		//Q. 배열의 최댓값 구하기 (for문)
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		//
		max = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}		
		System.out.println("max: " + max);
	}
}
