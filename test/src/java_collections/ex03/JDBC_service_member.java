package ex03;

import java.sql.Connection;
import java.util.ArrayList;

public class JDBC_service_member implements IJdbcService<Member> {
	Connection conn = DBConn.getConnection();
	
	// DB에 입력(INSERT)
	public void insert() {

	}

	// DB 데이터 수정(UPDATE)
	public void update() {

	}

	// DB 데이터 삭제(DELETE)
	public void delete() {

	}

	// DB 데이터 조회(SELECT)
	public ArrayList<Member> select() {
		ArrayList<Member> list = new ArrayList<>();

		// DB에 접속

		// DB에 쿼리 실행
		String query = "SELECT * FROM tbl_member";

		// DB로부터 데이터 받기

		// 결과 반환해주기
		return list;
	}

}
