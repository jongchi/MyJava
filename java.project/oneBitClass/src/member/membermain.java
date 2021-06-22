package member;

import java.util.Scanner;

public class membermain {

	public static void main(String[] args) {
		MemberManager manager = new MemberManager(ClassMemberDAO.getInstance());

			
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			manager.createId();
			
			manager.editId();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
