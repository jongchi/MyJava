import java.util.Scanner;

public class Sample08_1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
//		##################################
//		# 1. ����
//		# 2. ����
//		# 3. ����
//		# 4. ������
//		# 5. ����
//		##################################
//		# �Ŵ� ��ȣ�� �Է����ּ���. :  
//		1 => �����Դϴ�.
		System.out.println("##################################");
		System.out.println("# 1. ����");
		System.out.println("# 2. ����");
		System.out.println("# 3. ����");
		System.out.println("# 4. ������");
		System.out.println("# 5. ����");
		System.out.println("##################################");
		System.out.println("�޴� ��ȣ�� �Է����ּ���. : ");
		String input = scanner.nextLine();
		char num = input.charAt(0);
		switch (num) {
			case '1' :
				System.out.println("�����Դϴ�.");
				break;
			case '2' :
				System.out.println("�����Դϴ�.");
				break;
			case '3' :
				System.out.println("�����Դϴ�.");
				break;
			case '4' : 
				System.out.println("�������Դϴ�.");
				break;
			case '5' : 
				System.out.println("�����ϰڽ��ϴ�.");
				break;
		}
	}

}
