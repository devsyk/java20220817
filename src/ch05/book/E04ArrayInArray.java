package ch05.book;

public class E04ArrayInArray {
	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3];
		for(int i=0; i<mathScores.length; i++) {
			for(int j=0; j<mathScores[i].length; j++) {
				System.out.printf("mathScores[%d][%d]=%d%n", i, j, mathScores[i][j]);
			}
		}
		System.out.println();
		
		
	}
}
