package ch03.book.exercise;

public class Ex06 {
	public static void main(String[] args) {
		// Q. 윗변:5 밑변:10 높이:7인 사다리꼴 넓이 구하기(소수자릿수까지)
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop + lengthBottom) * height) / 2.0; //2.0으로 나눠서 소수자리도 나오도록
		System.out.println(area);
	}
}
