package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({"/Signup","/signup"})
public class SignupServlet extends HttpServlet {
	
      
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// post 방식으로 데이터를 받을 떄 한글 인코딩 처리(필수)
		request.setCharacterEncoding("utf-8");
		
		String uid = request.getParameter("userid");
		String pw = request.getParameter("pw");
		String repw = request.getParameter("repw");
		String name = request.getParameter("userName");
		String comment = request.getParameter("comment");
		String gender = request.getParameter("gender");
		System.out.println("userid: " + uid);
		System.out.println("password: " + pw);
		System.out.println("username: " + name);
		
		// 응답하는 데이터 타입
		response.setContentType("text/html; chareset=utf-8");
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("	<meta charset=\"uft-8\">");
		out.println("</head>");
		out.println("	<body>");
		out.println("		<h3>user ID: " + uid + "</h3>");
		out.println("		<h3>password: " + pw + "</h3>");
		out.println("		<h3>Name: " + name + "</h3>");
		out.println("		<h3>comment: " + comment + "</h3>");
		out.println("		<h3>gender: " + gender + "</h3>");
		out.println("	</body>");
		out.println("</html>");
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("포스트 방식으로 요청처리!");
		doGet(request, response);
	}
	
}
