package ch10.lecture.p03exception;

public class C03Exception {
	public static void main(String[] args) {
		
		try {
			Class a = Class.forName("java.lang.String");
			System.out.println(a.toString());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
