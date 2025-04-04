package Inheritance;

import java.util.Scanner;

public class Document {

	private String content;
	String str[] = new String[3];

	public String getContent() {
		return content;
	}

	public String setContent(String content) {
		return this.content = content;
	}

	public void write() {
		Scanner sc = new Scanner(System.in);

		System.out.println("글을 입력하세요!");

		String content = "";
		for (;;) {
			String s = sc.nextLine();

			if (s.equals("END")) {
				System.out.println("문서작성이 완료되었습니다.");
				break;
			}
			content = content + "\n" + s;

		}
		this.content = content;
	}

}
