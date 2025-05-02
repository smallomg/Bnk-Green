package ex06;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int result = 10 / 0;
			System.out.println(result);	
		} catch(ArithmeticException e) {
			System.out.println("예외 발생 - 1");
		}
		
		try {
			int[] arr = new int[3];
			arr[3] = 1;
			System.out.println(arr[3]);			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생 - 2");
		}
		
		try {
			String s = null;
			System.out.println(s.charAt(0));
		} catch(NullPointerException e) {
			System.out.println("예외 발생 - 3");
		}
		
		System.out.println("프로그램 종료!");
	}
}
