package ex01;

public class Function2 {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;

		int A[] = f(n1,n2);
		
		System.out.println("두 수의 합은 : "+A[0]);
		System.out.println("두 수의 차는 : "+A[1]);
	}
	
	static int[] f(int x,int y){
		int A[] = new int[2];
		
		A[0] = x+y;
		A[1] = x-y;
		
		return A;

	}
}
