package ch10.lecture.p02try;

public class C05Catch {
	public static void main(String[] args) {
		//catch블럭은 순서가 상관 있음
		
		String[] arr = {"삼백"};
		
		try {
			int a = Integer.parseInt(arr[0]);
			System.out.println(a);
			
//		} catch (Exception e) { 
//			System.out.println("wrong!!!");
//			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("wrong Index");
			
		} catch (NumberFormatException e) {
			System.out.println("wrong format");
			
		} catch (Exception e) {  //상위타입은 나중에
			System.out.println("wrong!!!");
		
		}
	}
}
