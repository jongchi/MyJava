package member.service;

import member.dao.Dao;
import member.domain.Member;

public class ChangePasswordService {
	
	private Dao dao;
	
	public void setDao(Dao dao) {
		this.dao = dao;
		
		
	}
	// 기본생성자
	public ChangePasswordService() {
		System.out.println("ChangePasswordService 인스턴스 생성");
	}
	
	public ChangePasswordService(Dao dao) {
		this.dao = dao;
		System.out.println("ChangePasswordService 인스턴스 생성");
	}
	
	public void changePassword(String email, String oldPw, String newPw) throws Exception {
		
		Member member = dao.selectByEmail(email);
		
		if(member == null) {
			throw new Exception("존재하지않는 회원!");
		}
		
		member.changePassword(oldPw, newPw);
		
		dao.update(member);
	}
}
