package ch16.book.exercise.p08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
		);
		
		Map<String, List<String>> groupingMap = list.stream()
				.collect(Collectors.groupingBy((m) -> m.getJob(),  //직업별로 그룹화
						Collectors.mapping((m) -> m.getName(), Collectors.toList()))); //이름을 원소로 리스트에 넣기
		
		Map<String, List<String>> groupingMap2 = list.stream()
				.collect(Collectors.groupingBy(Member :: getJob,  //직업별로 그룹화
						Collectors.mapping(Member :: getName, Collectors.toList()))); //이름을 원소로 리스트에 넣기
		
		
		System.out.print("[개발자] ");
		groupingMap.get("개발자").stream().forEach(s -> System.out.print(s + " "));
		System.out.print("\n[디자이너] ");
		groupingMap.get("디자이너").stream().forEach(s -> System.out.print(s + " "));
	}
	
	static class Member {
		private String name;
		private String job;
		
		public Member(String name, String job) {
			this.name = name;
			this.job = job;
		}
		
		public String getName() { return name; }
		public String getJob() { return job; }
	}
}
