package ex01;

public class Function4 {

	public static void main(String[] args) {
		
		int A[] = new int[2];
		
		A[0] = 5;
		A[1] = 3;
		System.out.printf("%d, %d\n",A[0],A[1]);
		
		f1(A); //A는 배열
		
		System.out.printf("%d, %d\n",A[0],A[1]);
	}

	//참조변수일 경우 
	static void f1(int x[]) {	
		int temp = x[0];
		x[0] = x[1];
		x[1] = temp;
	}
	
	
	
	

}
