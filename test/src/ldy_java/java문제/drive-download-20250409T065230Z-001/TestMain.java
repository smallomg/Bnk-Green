package 평가;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어느 DBMS를 사용하겠습니까?");
		System.out.println("1. 오라클 \t 2. 마리아디비");
		int answer = sc.nextInt();
		
		
		IMapper_crud mapper;
		
		if(____) {
			mapper = new Mapper_Oracle();
		}else if(_____) {
			mapper = new _______________;
		}
		
		//멤버 데이터 입력
		mapper.create(Member member);
		
		//멤버 전체조회
		List<______> list = mapper.readAll();
		
		//멤버 목록 콘솔 출력
		for(_________ : _______) {
			System.out.println(___);
		}
		
		//멤버 한명 조회(멤버번호(정수))
		_______ m = mapper.read(____);
		
		
		
		
	}

}
