package ex01;

import java.util.Scanner;

public class Function9 {

	public static void main(String[] args) {

		
		  char[] str = { 'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'e', 'a', 's', 'y' };
		  int arr[] = new int[str.length]; Scanner sc = new Scanner(System.in);
		  
		  for (int i = 0; i < str.length; i++) { arr[i] = str[i]; str[i] = '*';
		  System.out.print(arr[i] + " ");
		  
		  }
		  
		  System.out.print("\n"); for (int i = 0; i < str.length; i++) {
		  System.out.print(str[i] + " "); } System.out.print("\n");
		  
		  int Score = 0; int count = 0;
		  
		  for (;;) {
		  
		  System.out.print("Call character >>"); int Num = sc.nextInt();
		  
		  for (int i = 0; i < arr.length; i++) { if (arr[i] == Num) { if (str[i] ==
		  (char) arr[i]) { continue; } count++; str[i] = (char) arr[i]; Score = Score +
		  10; System.out.print((char) arr[i] + " ");
		  
		  } else System.out.print(str[i] + " ");
		  
		  }
		  
		  System.out.print("\n"); System.out.print("점수 " + Score);
		  
		  if (count == str.length) { break; }
		  
		  System.out.print("\n");
		  
		  }
		 

		
			/*
			 * String str = "Java is easy";
			 * 
			 * System.out.println(str);
			 * 
			 * char[] temp = new char[str.length()]; char[] arr = new char[str.length()];
			 * System.out.println(temp.length);
			 * 
			 * temp[0] = str.charAt(0); System.out.print(temp[0]);
			 * 
			 * Scanner sc = new Scanner(System.in);
			 * 
			 * String s = sc.nextLine(); char ch = s.charAt(0);
			 */
		 
		
		
	
		
		
		
		
	}

}
