package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


public class MemberManager {
	
	private ClassMemberDAO dao;
	private Scanner sc;
	
	public MemberManager(ClassMemberDAO dao){
		this.dao = dao;
		sc = new Scanner(System.in);
	}

	// 회원 가입
	// 사용자에게 Scanner 클래스로 입력 받아 -> dao ClassMemberDAO 메소드로 저장
	void createId() {
		// Connection 객체 생성 -> 트랜젝션 처리
		Connection conn = null;

		// 2. 연결
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
		
			System.out.println("회원 가입을 시작합니다.");
			System.out.println("ID를 입력해주세요.");
			String mid = sc.nextLine();
			System.out.println("PW를 입력해주세요.");
			String mpw = sc.nextLine();
			System.out.println("이름을 입력해주세요.");
			String mname = sc.nextLine();
			System.out.println("생년월일을 입력해주세요. ex)91/07/21");
			String mdate = sc.nextLine();
			System.out.println("선호하시는 지역을 입력해주세요.");
			String mloc = sc.nextLine();
			System.out.println(mid+mpw+mname+mdate+mloc);
	
			ClassMember member = new ClassMember(0, mid, mpw, mname, mdate, mloc);

			int result = dao.createId(conn, member);
			
			if(result > 0 ) {
				System.out.println("입력 되었습니다.");
			} else {
				System.out.println("입력 실패!!!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// 회원 정보 수정
	// 회원 가입
	// 사용자에게 Scanner 클래스로 입력 받아 -> dao ClassMemberDAO 메소드로 저장
	void editId() {
		// Connection 객체 생성 -> 트랜젝션 처리
		Connection conn = null;

		// 2. 연결
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
		
			System.out.println("회원 정보를 수정합니다.");
			System.out.println("ID를 다시 한 번 입력해주세요.");
			String mid = sc.nextLine();
			System.out.println("수정하실 PW를 입력해주세요. 변경을 원치 않을 경우 기존 정보를 입력해주세요.");
			String mpw = sc.nextLine();
			System.out.println("지역을 입력해주세요. 변경을 원치 않을 경우 기존 정보를 입력해주세요.");
			String mloc = sc.nextLine();
			System.out.println("생년월일을 입력해주세요. ex)91/07/21");
			String mdate = sc.nextLine();
			
			ClassMember member = new ClassMember(mid, mpw, mloc, mdate);

			int result = dao.editInfo(conn, member);
			
			if(result > 0 ) {
				System.out.println("정보가 수정 되었습니다.");
			} else {
				System.out.println("수정 실패!!!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// 포인트 확인
	
	
}
