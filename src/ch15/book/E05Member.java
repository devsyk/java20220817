package ch15.book;

public class E05Member {
	public String name;
	public int age;
	
	public E05Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof E05Member) {
			E05Member member = (E05Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}		
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	};
}
