package ex04;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex01.Board;
import ex01.Member;

public class TableBoardUtil {

	
	public void selectBoard(Statement stmt) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.print("옵션을 선택하세요(1:[전체조회] 2:[선택조회]) : ");
		int option = sc.nextInt();
		
		if(option == 1) {
			selectBoardAll(stmt);
		} else if(option == 2) {
			selectBoardByTitle(stmt);
		} else {
			
		}
		
	}
	
	public void selectBoardAll(Statement stmt) throws SQLException {
		String query_select = "SELECT * FROM tbl_board";
		ResultSet rs = stmt.executeQuery(query_select);
		List<Board> list_board = new ArrayList<>();
		
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
		}
	}
	
	public void selectBoardByTitle(Statement stmt) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 게시글의 제목을 입력하세요 : ");
		String inputTitle = sc.next();
		
		String query_select = "SELECT * FROM tbl_board WHERE title like '%" + inputTitle + "%'";
		ResultSet rs = stmt.executeQuery(query_select);
		List<Board> list_board = new ArrayList<>();
		
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
		}
	}
	
	public void insertBoard(Statement stmt, Member currentUser) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("게시글 작성");
		
		System.out.print("게시글의 제목 : ");
		String title = sc.next();
		
		System.out.print("게시글의 내용 : ");
		String content = sc.next();
		
		String writer = currentUser.getId();
		
		//int no = Board.no++;
		int no = getBookNo(stmt) + 1;
		String bno = "b";
	
		if(no < 10) {
			bno = bno + "00" + no;
		} else if(no < 100) {
			bno = bno + "0" + no;
		} else {
			bno = bno + no;
		}
		
		String query_insert_board = "INSERT INTO tbl_board VALUES('" 
                   + bno + "', '" 
                   + title + "', '" 
                   + content + "', '" 
                   + writer + "', sysdate)";
		int result_insert_board = stmt.executeUpdate(query_insert_board);
		
		if(result_insert_board != 0) {
			System.out.println("게시글이 성공적으로 등록되었습니다!!");
			selectBoardAll(stmt);
		} else {
			System.out.println("게시글 등록에 실패했습니다...");
		}
	}
	
	public int getBookNo(Statement stmt) throws SQLException {
		String query_select = "SELECT bno FROM tbl_board";
		ResultSet rs = stmt.executeQuery(query_select);
		List<String> list = new ArrayList<>();
		
		int maxNo = 0;
		
		while(rs.next()) {
			Board board = new Board();
			String bno = rs.getString("bno");
			list.add(bno);
		}
		
		for(String b : list) {
			String numberPart = b.substring(1);
			int result = Integer.parseInt(numberPart); 
			if(result > maxNo) {
				maxNo = result;
			}
		}

		/*
		String bno = "b";
		if(maxNo < 10) {
			bno = bno + "00" + maxNo;
		} else if(maxNo < 100) {
			bno = bno + "0" + maxNo;
		} else {
			bno = bno + maxNo;
		}
		*/
		
		return maxNo;
	}
}
