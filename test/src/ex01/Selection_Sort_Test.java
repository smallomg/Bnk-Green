package ex01;

public class Selection_Sort_Test {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		
		int n = 5;
		
		double d;
		
		/*mid = 인덱스*/
		/*n = arr[mid] 값 비교 작으면 n아래로 비교 크면 n위로해서 비교*/

		d = arr.length/2;
		int mid = (int) Math.ceil(d);
		
		if(n==arr[mid]) {
			System.out.print("n 과 arr[mid]는 같습니다");
		}
		if(n > arr[mid]) {
			System.out.println("n이 더 큽니다");
			for(int i = mid;i<arr.length;i++) {
				if(n < arr[i]) {
					System.out.println("인덱스가 "+i+"일때 arr"+"["+i+"] > n");
					System.out.print("요소의 값은 "+arr[i]);
				}
			}
		}
		
		if(n < arr[mid]) {
			System.out.println("arr[mid]의 요소가 더 큽니다");
			for(int i = mid;i>=0;i--) {
				if(n > arr[i]) {
					System.out.println("인덱스가 "+i+"일때 arr"+"["+i+"] < n");
				}
				
			}
			System.out.print("n의 값은 "+n);
		}
		
		
		
		
	}

}
