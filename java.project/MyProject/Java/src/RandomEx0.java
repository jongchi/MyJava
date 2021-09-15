import java.util.Random;

public class RandomEx0 {
	// 이메일 인증에 사용할 6자리 난수 생성 메소드
	public static void main(String[] args) {
		int minNum = 100000;
		int maxNum = 1000000;
		
		Random random = new Random();
		int result = random.nextInt((maxNum-minNum+1))+minNum;
		
		System.out.println(result);
	}

}
