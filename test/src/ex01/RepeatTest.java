package ex01;

public class RepeatTest {

	public static void main(String[] args) {

		// i는 반복제어변수
		/*
		 * for (int i = 0; i < 3; i++) { System.out.println("바깥쪽 반복문 실행..." + (i + 1));
		 * for (int k = 0; k < 5; k++) { System.out.println("\t안쪽 반복문 실행..." + (k + 1));
		 * }
		 * 
		 * }
		 */

		
		//구구단
		for(int i =1;i<10;i++) {
			for(int j = 2;j<10;j++) {
			
				System.out.println(i+" * "+j +" = "+i*j +"  ");	
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		
		for(int j =1;j<10;j++) {
			for(int i = 2;i<10;i++) {
			
				System.out.print(i+" * "+j +" = "+i*j +"\t");	
			}
			System.out.print("\n");
			
		}
		
		
		
	}
}
