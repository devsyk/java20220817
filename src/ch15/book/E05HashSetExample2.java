package ch15.book;

import java.util.HashSet;
import java.util.Set;

public class E05HashSetExample2 {
	public static void main(String[] args) {
		Set<E05Member> set = new HashSet<>();
		
		set.add(new E05Member("홍길동", 30));
		set.add(new E05Member("홍길동", 30));
		
		System.out.println("총 객체수: " + set.size());
	}
}
