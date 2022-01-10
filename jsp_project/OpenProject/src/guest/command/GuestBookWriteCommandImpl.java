package guest.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import guestbook.service.GuestBookWriteService;

public class GuestBookWriteCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest request, HttpServletResponse response) {
		
		String view = null;
		
		if(request.getMethod().equals("GET")) {
			
			view = "/WEB-INF/view/guestbook/writeform.jsp";
			
		} else if(request.getMethod().equals("POST")) {
			
			request.setAttribute("result", GuestBookWriteService.getInstance().writeArticle(request, response));
			
			view = "/WEb-INF/view/guestBook/write.jsp";
		}
		
		return view;
	}

}
