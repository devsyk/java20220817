package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C03WildCard {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("maverick");
		list1.add("iceman");
		
		// ? : unbounded wildcard
		ArrayList<?> list2 = list1; //ok
//		list2.add(""); //X  - ?는 뭐든지 올수 있기 때문에 제한 때문에 모두 불가능
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(100);
		list3.add(200);
		
		ArrayList<?> list4 = list3;
//		list4.add(300); //X
//		list4.add(""); //X
//		list4.add(new Object()); //X
		Object o1 = list4.get(0);
	}
}
