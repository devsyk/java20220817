package ch03.book;

public class E08InfinityAndNaNCheck {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
//		double z = x % y;
		
		System.out.println(Double.isInfinite(z)); //Infinity인지 확인 > true
		System.out.println(Double.isNaN(z)); //NaN인지 확인 > false
		System.out.println(z + 2); //Infinity 연산 = Infinity
		
		System.out.println("===================");
		
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance1 = 10000.0;
		
		currentBalance1 += val; //NaN 연산 = NaN
		System.out.println(currentBalance1); //NaN
		
		System.out.println("-------------------");
		
		double currentBalance2 = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}
		
		currentBalance2 += val;
		System.out.println(currentBalance2);
	}
}
