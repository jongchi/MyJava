import java.util.Scanner;

public class Sample08 {
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
		if(num == '1') {
			System.out.println("�����Դϴ�.");
		} else if(num == '2') {
			System.out.println("�����Դϴ�.");
		} else if(num == '3') {
			System.out.println("�����Դϴ�.");
		} else if(num == '4') {
			System.out.println("�������Դϴ�.");
		} else if(num == '5') {
			System.out.println("�����ϰڽ��ϴ�.");
		} else if((num > '0')||(num < '5')) {
			System.out.println("�ٽ� �Է����ּ���.");
			input = scanner.nextLine();
		}
		
		
	}

}
