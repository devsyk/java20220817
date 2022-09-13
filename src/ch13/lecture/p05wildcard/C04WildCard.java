package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C04WildCard {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(300);
		
		ArrayList<?> list2 = list1;
//		list2.add(500); //X
		
		// ? super Type : Lower Bounded Wildcard
		ArrayList<? super Integer> list3 = list1;
		list3.add(500);
		
	}
}
