package p99codingbat;

/*
 * CodingBat - code practice
 * https://codingbat.com/java/String-1
 */
public class String1 {
	public String withoutEnd(String str) {
		str = str.substring(1);
		str = str.substring(0, str.length() - 1);
		return str;
	}

	public String firstHalf(String str) {
		return str.substring(0, str.length() / 2);
	}

	public String firstTwo(String str) {
		if (str.length() > 2) {
			return str.substring(0, 2);
		}
		return str;
	}

	public String extraEnd(String str) {
		int n = str.length();
		String answer = str;
		if (n > 2) {
			answer = str.substring(n - 2);
		}
		return answer + answer + answer;
	}

	public String makeOutWord(String out, String word) {
		String left = out.substring(0, 2);
		String right = out.substring(2);
		return left + word + right;
	}

	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	public String helloName(String name) {
		return "Hello " + name + "!";
	}
}
