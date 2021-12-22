package member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.domain.Member;
import member.service.LoginService;

public class LoginCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest request, HttpServletResponse response) {
		
		String view = null;
		
		if(request.getMethod().equals("GET")) {
			
			view = "/WEB-INF/views/member/loginForm.jsp";
		} else if(request.getMethod().equals("POST")) {
			
			// Service 클래스에서 반환한 Member객체를 확인
			// Member 객체가 null이 아니다 -> session 속성에 로그인 정보 저장
			// Member 객체가 null이다 -> "아이디 또는 비밀번호가 틀립니다." 노출
			// SQLException
			boolean loginChk = false;
			String msg = "아이디 또는 비밀번호를 확인해주세요.";
			
			try {
				
				Member member = LoginService.getInstance().login(request, response);
				
				if(member != null) {
					// 로그인 처리 : 로그인 정보를 저장하는 loginInfo 객체 생성
					request.getSession().setAttribute("loginInfo", member.getLoginInfo());
					msg = "로그인 되었습니다.";
					loginChk = true;
					
				}
			} catch (Exception e) {
				e.printStackTrace();
				msg = "처리도중 예외가 발생했습니다. 다시 시도해주세요.";
				
				view = "/WEB-INF/views/member/login.jsp";
			}
		}
		
		return view;
	}

}
