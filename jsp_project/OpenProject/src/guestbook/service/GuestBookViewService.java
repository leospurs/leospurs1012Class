package guestbook.service;

public class GuestBookViewService {
	
	private GuestBookViewService() {
		
	}
	
	private static GuestBookViewService service = new GuestBookViewService();
	
	public static GuestBookViewService getInstance() {
		return service;
	}
	
	public PageView
}
