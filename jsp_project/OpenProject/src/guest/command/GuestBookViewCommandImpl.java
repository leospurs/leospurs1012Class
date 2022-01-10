package guest.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

public class GuestBookViewCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("pageView", GuestBookViewService.getInstance.getPageView(request,response));
		
		
		
		
		return "/WEB-INF/guestbook/view.jsp";
	}
	
	
}
