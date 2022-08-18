package ch03.book;

public class E06CheckOverflow {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000); //1. safeAdd 메소드 호출
			System.out.println(result);
		} catch(ArithmeticException e) { // ArithmeticException
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음"); 
		}
	}
	
	// safeAdd 메소드
	public static int safeAdd(int left, int right) {
		if(right > 0) { //2-1. right가 0 보다 클 경우
			if(left > (Integer.MAX_VALUE - right)) { //2-1-1. (Integer최댓값에서 right 뺀 값)보다 left가 큰 경우
				throw new ArithmeticException("오버플로우 발생"); // 3-1. ArithmeticException 예외처리 호출
			}
		} else { //2-2. right가 0 보다 작거나 같을 경우
			if(left < (Integer.MIN_VALUE - right)) { //2-2-1. (Integer최솟값에서 right 뺀 값)보다 left가 작은 경우
				throw new ArithmeticException("오버플로우 발생"); // 3-1. ArithmeticException 예외처리 호출
			}
			// 예외처리 안한다면 3-2.return
		}
		return left + right; //3-2. left와 right를 더한 값을 return
	}
}