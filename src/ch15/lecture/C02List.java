package ch15.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02List {
	public static void main(String[] args) {
		// 리스트 만드는 방법1
		List<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("css");
		list1.add("spring");
		System.out.println(list1);
		
		// 방법2
		List<String> list2 = Arrays.asList("java", "css", "spring");
		System.out.println(list2);
		
		// 방법3
		List<String> list3 = List.of("java", "css", "spring");
		System.out.println(list3);
		
		// 방법2,3은 변경 불가능
		list1.add("jsp");
//		list2.add("jsp"); //X
//		list3.add("jsp"); //X
		
	}
}
