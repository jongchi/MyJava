import java.util.Scanner;

public class Workshop01 {
	
	public static int getUserInput() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		return Integer.parseInt(inputString);
	}
	public static void main(String[] args) {
		System.out.print("====== �޴� ======");
		System.out.println("1. �Ƹ޸�ī�� 2000��");
		System.out.println("2. ī��� 3000��");
		System.out.println("3. ���̱� 1500��");
		System.out.println("4. ũ��ġ�� 500��");
		System.out.println("====== �ֹ� ======");
		System.out.println("�ֹ��Ͻ� ������ �޴� ���� ���ڷ� �Է����ּ���.");
		System.out.print("�Ƹ޸�ī�� �ֹ� ���� : ");
		int americano = getUserInput();
		int avalue = americano*1500;
		System.out.print("ī��� �ֹ� ���� : ");
		int cafelatte = getUserInput();
		int cvalue = cafelatte*3000; 
		System.out.print("���̱� �ֹ� ���� : ");
		int bagle = getUserInput();
		int bvalue = bagle*1500; 
		System.out.print("ũ��ġ�� �ֹ� ���� : ");
		int creamcheeze = getUserInput();
		int zvalue = creamcheeze*500; 
		System.out.println("====== �ݾ� ======");
		System.out.printf("�Ƹ޸�ī�� : %d�� %n", avalue);
		System.out.printf("ī��� : %d�� %n", cvalue);
		System.out.printf("���̱� : %d�� %n", bvalue);
		System.out.printf("ũ��ġ�� : %d�� %n", zvalue);
		System.out.println("=================");
		int total = avalue + cvalue + bvalue + zvalue;
		int point = 0;
		if(total >= 30000) {
			point = total/100*2;
		} else if (total >= 12000) {
			point = total/100;
		}
		System.out.println("�� ���� �ݾ� : " + total + "��");
		System.out.println("����Ʈ ���� : " + point + "��");
//		int americano = getUserInput();
//		System.out.println(num);
//		int num2 = getUserInput();
//		System.out.println(num2);
	}
}