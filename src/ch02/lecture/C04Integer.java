package ch02.lecture;

public class C04Integer {
	public static void main(String[] args) {
		// 정수 : byte(1), short(2), int(4), long(8)
		
		// 1byte == 8bit (0000 0000)
		
		/*
		 * byte(1byte)
		 * 범위: -128 ~127
		 * 
		 */
		byte a = 0;
		byte b = 127;
		byte c = -128;
//		byte d = 128;
//		byte e = -129;
		
		/*
		 * short (2byte) 
		 * 범위: -32,769 ~ 32,767
		 * 
		 */
		short f = -32768;
		short g = 32767;
//		short h = 32768;
//		short i = -32769;
		
		/*
		 * int (4 byte) 
		 * 범위: -2,147,483,648 ~ 2,147,483,647
		 * 
		 */
		int j = -2147483648;
		int k = 2147483647;
//		int l = -3000000000;
//		int m = 3000000000;
		
		/*
		 * long (8 byte) 
		 * 범위: 매우 큰값
		 * 
		 */
		long o = 2200000000L;
		long p = -3000000000L;
		
		//정수 literal 작성시 주의 할점
		//정수 literal은 int로 취급
		//범위 넘어갈 때는 long타입으로 표시
		//작성하는 수가 클 땐 _와 조합가능	
		long q = 2_100_000_000;
		long r = 21_0000_0000;
		
		//연산시 overflow 주의
		int s = 2147483647;
		int t = s + 1; //2147483648 X 
		System.out.println(t); //-2147483648
			
	}
}
