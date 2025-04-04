package vo1;

public class Stringtest {

	public static void main(String[] args) {

		String s1 = "abcdefg";
		String s2 = "Hello";

		System.out.println(s1 == s2); // 주소값이 같음
		String s3 = new String("Hello");

		System.out.println(s1 == s3); // 주소값이 같냐
		System.out.println(s1.equals(s3)); // 값이 같냐

		char c = s1.charAt(0);
		System.out.println(c);

		char c2[] = new char[s1.length()]; // 문자열의 길이를 알아낼때는 함수를 쓰고 배열의 길이를 알아낼때는 변수를 쓴다

		for (int i = 0; i < c2.length; i++) {
			char c1 = s1.charAt(i);
			c2[i] = c1;

		}
		for (int i = 0; i < c2.length; i++) {
			System.out.print(c2[i] + " ");
		}
		System.out.print("\n");
		System.out.println(s1.length());

		// subString
		// 0부터 s1.length()까지 반환해주겠다
		String result = s1.substring(0, s1.length());
		System.out.println(s1.substring(0, s1.length()));

		// 3부터 마지막까지
		String result1 = s1.substring(3);
		System.out.println(result1);

		// contains()
		boolean tf = s1.contains("def"); // s1이 def 문자열을 가지고 있는가
		System.out.println(tf);

		// indexof()
		int idx = s1.indexOf("a"); // 인덱스 번호 알려줌
		System.out.println(idx);

		// equals()
		// 문자열(String)이나 객체(Object)의 "값이 같은지" 비교하는 함수
		String str1 = "Java";
		String str2 = "java";
		System.out.println(str1.equals(str2)); // 대소문자 구분
		System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자 구분 없이 문자열 비교

		System.out.println(str1.toUpperCase());// 대문자 변환
		System.out.println(str1.toLowerCase());// 소문자로 변환
		System.out.println(str1.toLowerCase().equals(str2));

		// trim();
		// 앞뒤에 있는 공백 제거 중간공백은 그대로
		String newStr = str1.trim();
		System.out.println(newStr.length());

		// replace()
		String x = str2.replace('a', 'o'); // a가 o로 바뀜
		System.out.println("replace : " + x);

		// split()
		String k = "aaa,bbb,ccc,ddd";
		String arr[] = k.split(","); // split("구분자")기준으로 배열로 저장한다 .(마침표)는 구분자로 X
		System.out.println("split의 배열 길이 : " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("split[" + i + "] = " + arr[i]);
		}
	}

}
