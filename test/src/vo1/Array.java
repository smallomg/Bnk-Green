package vo1;

public class Array {

	private int []arr;
	
	
	Array(){
		arr = new int[5];
	}
	
	
	int add(int i,int n) {
		arr[i] = n;
		return arr[i];
	}
	
	int delete(int i) {
		arr[i] = 0;
		return arr[i];
		
	}
}
