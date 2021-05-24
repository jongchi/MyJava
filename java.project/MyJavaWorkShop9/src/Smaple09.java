
public class Smaple09 {

	public static void main(String[] args) {
		try {
		int a = 1/0;
		}	catch(OutOfMemoryError ex) {
			System.out.println("OutOfMemoryError 오류 발생하였으니 관리자에게 문의해주세요.");
		}	catch(ArithmeticException ex) {
			String name = ex.getMessage();
			System.out.println(name);
			System.out.println("ArithmeticException 오류 발생하였으니 관리자에게 문의해주세요. ");
		}	catch(Exception ex) {
			System.out.println("Exception 오류가 발생하였습니다.");		
		}
		System.out.println("종료합니다.");
	}
		
}


