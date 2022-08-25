package ch05.book.exercise;

public class Ex08ForEach {
	public static void main(String[] args) {
		//Q. 주어진 배열의 전체 항목의 합과 평균값 구하기 (중첩 for문)
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		double avg = 0.0;
		
		//
		//double num = 0;
		int num = 0;
		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[i].length; j++) {
//				sum += array[i][j];
//				//num++;  //이것도 가능
//			}		
//			num += array[i].length;
//		}
		for(int[] item : array) {			
			for(int item2 : item) {
				sum += item2;
				//num++;  //이것도 가능
			}		
			num += item.length;
		}
		avg = sum / (double)num;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);		
	}
}
