package ex05;

import lombok.Data;

@Data
public class A {


	String name;
	int age;

	public A(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
