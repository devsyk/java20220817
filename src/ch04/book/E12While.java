package ch04.book;

public class E12While {
	public static void main(String[] args) {
		//1~10 출력
		int i = 1;
		
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("===========");
		
		
		//1~100 합
		int j = 1;
		int sum = 0;
		
		while(j <= 100) {
			sum += j;
			j++;
		}		
		System.out.println("1~" + (j-1) + " 합: " + sum);
	}
}
