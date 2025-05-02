package ex12;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet("/transfer")
public class transferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccountDAO accountDAO = new AccountDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fromAccountId = request.getParameter("fromAccount");
		String toAccountId = request.getParameter("toAccount");
		String amountStr = request.getParameter("amount");

		Connection conn = null;

		try {
			double amount = Double.parseDouble(amountStr);
			try {
				conn = Service.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} // 트랜잭션 시작

			accountDAO.withdraw(conn, fromAccountId, amount);
			accountDAO.deposit(conn, toAccountId, amount);

			Service.commit(conn); // 모두 성공 시 커밋

			request.setAttribute("message", "이체 성공: " + fromAccountId + " → " + toAccountId + " " + amount + "원");

		} catch (SQLException | NumberFormatException e) {
			Service.rollback(conn);
			request.setAttribute("errormessage", "이체 실패: " + e.getMessage());
		} finally {
			Service.close(conn);
		}

		request.getRequestDispatcher("result.jsp").forward(request, response);
	}
}
