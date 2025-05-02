package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	// db연결
	public DAO() {
		conn = DBConn.getConnection();
	}

	// 책조회
	public List<Book> select() {
		List<Book> list = new ArrayList<>();

		try {
			String query = "SELECT * FROM book";
			rs = pstmt.executeQuery(query);

			while (rs.next()) {
				Book book = new Book();
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				
				book.setBno(bno);
				book.setTitle(title);
				book.setWriter(writer);
				book.setPublisher(publisher);
				book.setPrice(price);
				
				list.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	// 책작성
	public int insert(Book book) {
		int result = 0;
		String query = "INSERT INTO book VALUES(?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, book.getBno());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getWriter());
			pstmt.setString(4, book.getPublisher());
			pstmt.setInt(5, book.getPrice());
			result = pstmt.executeUpdate();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}

	// 책삭제
	public int delete(int bno) {
		int result = 0;
		String query = "DELETE FROM book WHERE bno = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bno);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
