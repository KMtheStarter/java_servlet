package ex1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class Ex5_LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false); // ������ �ִ� ���� Ȱ���ϱ� ���� false��
		if (session != null) {
//			session.removeAttribute("uid"); // �ʿ��� uid ���Ǹ� ����
			 session.invalidate(); // ��� ������ ����
		}
		resp.sendRedirect("indexServlet");
	}

	
}