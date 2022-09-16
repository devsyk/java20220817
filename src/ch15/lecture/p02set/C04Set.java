package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C04Set {
	public static void main(String[] args) {
		// element가 같은지 판단 >> equals()
		Set<String> set = new HashSet<>();
		System.out.println(set.add("java"));
		set.add("css");
		set.add("java");
		System.out.println(set.add(new String("java")));

		System.out.println(set);
	}
}
