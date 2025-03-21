package ex01;

public class Function8 {

	public static void main(String[] args) {
		int n = 1;
		int result = f(n);
		System.out.println(result);

	}

	static int f(int param1) {
		int n = 10;
		int result = f2(param1, n); // param1 = 1 n = 10
		return result;
	}

	static int f2(int param1, int param2) {
		int n = 100;

		int result = f3(param1, param2, n); // param1 = 1 param2 = 10 n = 100
		return result;

	}

	static int f3(int param1, int param2, int param3) { // param1 = 1 param2 = 10 param3 = 100 n = 1000
		int n = 1000;
		int result = f4(param1, param2, param3, n);
		return result;
	}

	static int f4(int param1, int param2, int param3, int param4) {
		// param1 = 1 param2 = 10 param3 = 100 param4 = 1000
		return param1 + param2 + param3 + param4;
	}

}
