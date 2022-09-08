package p99codingbat;

/*
 * CodingBat - code practice
 * https://codingbat.com/java/Warmup-1
 */
public class Warmup1 {
	public boolean stringE(String str) {
		String regex = "[^e]*e[^e]*e?[^e]*e?";
		return str.matches(regex);
		
//		int cnt = 0;
//
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == 'e') {
//				cnt++;
//			}
//		}
//		return cnt >= 1 && cnt <= 3;
	}

	public boolean mixStart(String str) {
		String regex = ".ix.*";
		// String regex = "[a-z]ix\\s?([a-z]+)?";
		return str.matches(regex);

//		if (str.length() >= 3) {
//			String sub = str.substring(1, 3);
//			return sub.equals("ix");
//		}
//		return false;
	}

	public String everyNth(String str, int n) {
		String res = "";

		for (int i = 0; i < str.length(); i += n) {
			char c = str.charAt(i);
			res += c;
		}

		return res;
	}

	public String backAround(String str) {
		char lastChar = str.charAt(str.length() - 1);

		String res = lastChar + str + lastChar;

		return res;
	}

	public String notString(String str) {
		if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
			return str;
		}
//		if(str.startsWith("not")) {
//			return str;
//		}
		return "not " + str;
	}

	public boolean nearHundred(int n) {
		return (n >= 90 && n <= 110) || (n >= 190 && n <= 210);
	}

	public boolean makes10(int a, int b) {
		int sum = a + b;

		if (sum == 10) {
			return true;
		} else {
			return (a == 10) || (b == 10);
		}
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}

	public int diff21(int n) {
		int diff = 21 - n;
		return (diff < 0) ? diff * -2 : diff;
	}

	public int sumDouble(int a, int b) {
		int sum = a + b;
		return (a == b) ? sum * 2 : sum;
	}
}
