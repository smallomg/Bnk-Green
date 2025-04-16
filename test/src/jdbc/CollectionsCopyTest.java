package jdbc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsCopyTest {

	public static void main(String[] args) {

		List<String>src = new ArrayList<>();
		
		//수정가능한 리스트로 생성
		List<String> dst = new ArrayList<>(src); //Mutable(변경가능한)객체로 재성성
		System.out.println(dst);
		//정렬을 수행함
		Collections.sort(dst);
		System.out.println(dst);
		//다시 정렬 이전 상태로 돌아갈 필요가 생겼다
		Collections.copy(dst,src);
		System.out.println(dst);
		//수정가능한 상태인지 확인
		dst.remove(0);
		System.out.println(dst);
	}

}
