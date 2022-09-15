package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C03Set {
	public static void main(String[] args) {
		// Set 만들기
		
		//수정 가능한 Set
		Set<String> set1 = new HashSet<>(); 
		set1.add("bob");
		set1.add("hangman");
		set1.add("goose");
		set1.remove("goose");
		System.out.println(set1);
		
		//수정 불가능한 Set
//		Set<String> set2 = Set.of("thor", "hulk", "batman", "thor"); //중복 불가능
		Set<String> set2 = Set.of("thor", "hulk", "batman");
//		set2.add("super"); //X
//		set2.add("hulk"); //X
		System.out.println(set2.contains("thor"));
		System.out.println(set2.size()); //3
		
		
	}
}
