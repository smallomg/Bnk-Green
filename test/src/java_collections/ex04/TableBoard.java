package ex04;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import ex01.Member;

public class TableBoard {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//==================================================//
		// 서버 연결 준비
		DBConn dbConn = new DBConn();
		Statement stmt = dbConn.startInit();
		
		/*
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String uid = "green";
		String upw = "1234";
		
		// DB 연결 객체
		Connection conn = DriverManager.getConnection(url, uid, upw);
		
		// 쿼리 실행 객체
		Statement stmt = conn.createStatement();
		*/
		
		
		//==================================================//
		// 프로그램 실행 출력
		Scanner sc = new Scanner(System.in);

		// 회원가입
		Member currentUser = new Member();
		MemberUtil memberUtil = new MemberUtil();
		memberUtil.createUser(stmt, currentUser);
		
		System.out.println();	// 빈칸
		
		// 회원가입
		/*
		Member currentUser = new Member();
		String id;
		String pw;
		String name;
		String phone;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입 해주시기 바랍니다");

		System.out.print("아이디 : ");
		id = sc.next();
		System.out.print("비밀번호 : ");
		pw = sc.next();
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("연락처 : ");
		phone = sc.next();
		grade = 'C';
		
		String query_insert = "INSERT INTO tbl_member VALUES('" + id + "', '" + pw + "', '" + name + "', '" + phone + "', '" + grade + "')";
		int result_insert = stmt.executeUpdate(query_insert);

		if(result_insert != 0) {
			System.out.println("회원가입에 성공했습니다!!");
			currentUser.setId(id);
			currentUser.setPw(pw);
			currentUser.setName(name);
			currentUser.setPhone(phone);
			currentUser.setGrade(grade);
		} else {
			System.out.println("회원가입에 실패했습니다..");
		}
		*/
		
		//==================================================//
		// 게시판 기능
		TableBoardUtil util = new TableBoardUtil();
		
		/*
		List<Board> list_board = new ArrayList<>();
		String query_select = "SELECT * FROM tbl_board";
		String query_select_by_title = "";
		String query_insert_board = "";
		String query_delete_board = "";
		ResultSet rs;
		*/
		
		while(true) {
			System.out.print("실행할 기능을 선택하세요(1:[게시글조회] 2:[게시글작성] 3:[게시글 삭제] 0:[종료]) : ");
			int choose = sc.nextInt();

			//System.out.println();	// 빈칸
			
			if(choose == 1) {
				// 게시글 조회
				util.selectBoard(stmt);
				
				/*
				// 게시글 조회
				System.out.println("게시글 목록 조회");
				rs = stmt.executeQuery(query_select);
				
				while(rs.next()) {
					Board board = new Board();
					String bno = rs.getString("bno");
					String title = rs.getString("title");
					String content = rs.getString("content");
					String writer = rs.getString("writer");
					Date regDate = rs.getDate("regdate");

					board.setBno(bno);
					board.setTitle(title);
					board.setContent(content);
					board.setWriter(writer);
					board.setRegDate(regDate);
					
					list_board.add(board);
				}
				
				for(Board b : list_board) {
					System.out.println(b);
				}*/
			} else if(choose == 2) {
				// 게시글 작성
				util.insertBoard(stmt, currentUser);
				
				// 게시글 작성
				/*
				System.out.println("게시글 작성");
				
				System.out.print("게시글의 제목 : ");
				String title = sc.next();
				
				System.out.print("게시글의 내용 : ");
				String content = sc.next();
				
				String writer = currentUser.getId();
				
				int no = Board.no++;
				String bno = "b";
				
				if(no < 10) {
					bno = bno + "00" + no;
				} else if(no < 100) {
					bno = bno + "0" + no;
				} else {
					bno = bno + no;
				}
				
				query_insert_board = "INSERT INTO tbl_board VALUES('" 
		                   + bno + "', '" 
		                   + title + "', '" 
		                   + content + "', '" 
		                   + writer + "', sysdate)";
				int result_insert_board = stmt.executeUpdate(query_insert_board);
				
				if(result_insert_board != 0) {
					System.out.println("게시글이 성공적으로 등록되었습니다!!");
				} else {
					System.out.println("게시글 등록에 실패했습니다...");
				}
				*/
			} else if(choose == 3) {
				// 게시글 삭제
				
			} else if(choose == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("올바르지 않은 입력입니다. 다시 입력해주시기 바랍니다.");
			}  
			
			System.out.println();	// 빈칸
		}

	}
	
}
