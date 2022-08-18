package ch02.book;

public class E11Casting {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;	// int > char
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;	// long > int
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;	// double > int
		System.out.println(intValue);
	}
}
