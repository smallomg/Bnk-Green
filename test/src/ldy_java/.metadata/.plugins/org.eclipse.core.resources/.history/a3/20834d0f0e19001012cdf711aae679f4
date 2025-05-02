package ex02;

public interface BasicOperations {
	public int add(int num1, int num2);
	public int sub(int num1, int num2);
	public int mul(int num1, int num2);
	public double div(int num1, int num2);
	
	default int power(int num1, int num2) {
		int power = 1;
		for(int i=1; i<=num2; i++) {
			power = power * num1; 
		}

		return power;
	}
}
//인터페이스로 사칙연산을 정리
/*
int power = 1;
for(int i=1; i<=num2; i++) {
	power = power * num1; 
}

return power;
*/
