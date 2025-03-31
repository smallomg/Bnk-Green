package vo1;

public class Result {
	
	
	
	
	public static void main(String[] args) {

		Result arr[] = new Result[3];
		
		arr[0] = new Retangle();
		arr[1] = new Triangle();
		arr[2] = new Circle();
	
		for (int i = 0; i < arr.length; i++) {
			
			arr[i].f();
		}
	}

	void f() {}
}
