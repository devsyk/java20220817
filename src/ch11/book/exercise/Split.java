package ch11.book.exercise;

import java.util.StringTokenizer;

public class Split {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		//방법1 : split() 메소드 이용
		String[] resArr = str.split(",");
		for(String s : resArr) {
			System.out.println(s);
		}
		System.out.println();
		
		//방법2 : StringTokenizer 이용
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}
}
