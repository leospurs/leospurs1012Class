package mm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mm.dao.MemberDao;
import mm.service.ChangePasswordService;

@Configuration
public class JavaConfig2 {
	
	@Autowired
	MemberDao memberDao;

	// ChangePasswordService : dao 주입
	@Bean
	public ChangePasswordService changeService() {
		ChangePasswordService service = new ChangePasswordService();
		service.setDao(memberDao);
		return service;
	}
	
	
}
