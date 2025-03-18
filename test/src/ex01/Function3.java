package ex01;

public class Function3 {

	public static void main(String[] args) {
		int n = 20;
		char x = 'A';
		
		f(n,x);
		
		System.out.print("\n");
		System.out.println("---End---");
	}
	
	static void f(int n,char x){
		for(int i = 0; i<n;i++) {
			if(i%5==4) {
				System.out.print('B');
			}
			else System.out.print('A');
		}
		
	}
	/*출력 결과
	 * AAAAAAAAAAAAAAAAAAAA
	 * ---End---
	 * */

}
