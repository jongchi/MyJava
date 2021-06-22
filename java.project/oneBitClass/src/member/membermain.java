package member;

import java.util.Scanner;

public class membermain {

	public static void main(String[] args) {
		MemberManager manager = new MemberManager(ClassMemberDAO.getInstance());

			
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 회원 가입
			//manager.createId();
			// 정보 수정
			//manager.editId();
			// 정보 보기
			manager.showMyInfo();
			// 포인트 확인
			manager.showPoint();
			// 포인트 충전
			manager.addPoint();
			// 포인트 인출
			manager.subPoint();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
