import java.util.Scanner;

public class Workshop01 {
	
	public static int getUserInput() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		return Integer.parseInt(inputString);
	}
	public static void main(String[] args) {
		System.out.print("====== 메뉴 ======");
		System.out.println("1. 아메리카노 2000원");
		System.out.println("2. 카페라떼 3000원");
		System.out.println("3. 베이글 1500원");
		System.out.println("4. 크림치즈 500원");
		System.out.println("====== 주문 ======");
		System.out.println("주문하실 수량을 메뉴 옆에 숫자로 입력해주세요.");
		System.out.print("아메리카노 주문 수량 : ");
		int americano = getUserInput();
		int avalue = americano*1500;
		System.out.print("카페라떼 주문 수량 : ");
		int cafelatte = getUserInput();
		int cvalue = cafelatte*3000; 
		System.out.print("베이글 주문 수량 : ");
		int bagle = getUserInput();
		int bvalue = bagle*1500; 
		System.out.print("크림치즈 주문 수량 : ");
		int creamcheeze = getUserInput();
		int zvalue = creamcheeze*500; 
		System.out.println("====== 금액 ======");
		System.out.printf("아메리카노 : %d원 %n", avalue);
		System.out.printf("카페라떼 : %d원 %n", cvalue);
		System.out.printf("베이글 : %d원 %n", bvalue);
		System.out.printf("크림치즈 : %d원 %n", zvalue);
		System.out.println("=================");
		int total = avalue + cvalue + bvalue + zvalue;
		int point = 0;
		if(total >= 30000) {
			point = total/100*2;
		} else if (total >= 12000) {
			point = total/100;
		}
		System.out.println("총 구매 금액 : " + total + "원");
		System.out.println("포인트 적립 : " + point + "점");
//		int americano = getUserInput();
//		System.out.println(num);
//		int num2 = getUserInput();
//		System.out.println(num2);
	}
}