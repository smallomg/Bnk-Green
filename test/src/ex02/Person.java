package ex02;

public class Person {
	//이름 나이 성별
	//기본생성자를 포함해서 만들수있는 모든 생성자 만들기
	
	String name;
	int age;
	char gender;
	
	Person(){}
	
	Person(String name){}
	Person(int age){}
	Person(char gender){}
	
	Person(String name,int age){}
	Person(String name,char gender){}
	Person(int age,String name){}
	Person(int age,char gender){}
	Person(char gender,int age){}
	Person(char gender,String name){}
	
	Person(String name,int age,char gender){}
	Person(String name,char gender,int age){}
	Person(int age,String name,char gender){}
	Person(int age,char gender,String name){}
	Person(char gender,int age,String name){}
	Person(char gender,String name,int age){}
}
