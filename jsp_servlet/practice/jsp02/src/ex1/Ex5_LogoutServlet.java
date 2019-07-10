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
		HttpSession session = req.getSession(false); // 기존에 있던 세션 활용하기 위해 false줌
		if (session != null) {
//			session.removeAttribute("uid"); // 필요한 uid 세션만 삭제
			 session.invalidate(); // 모든 세션을 삭제
		}
		resp.sendRedirect("indexServlet");
	}

	
}
