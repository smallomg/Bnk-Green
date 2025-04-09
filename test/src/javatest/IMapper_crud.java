package javatest;

import java.util.List;

public interface IMapper_crud  {
	
	void create(Member member);

	Member read(int i);

	List<Member> readAll();

	
}
