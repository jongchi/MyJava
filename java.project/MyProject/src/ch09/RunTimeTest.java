package ch09;

public class RunTimeTest {
	public static void main(String[] args) {
		long sum = 0;
		long startTime = System.currentTimeMillis();
		
		for(long i=0;i<=100000000;i++) {
			sum += i;
		}
		System.out.println("1~100000000의 합은 : " +sum);
		long endTime = System.currentTimeMillis();
		
		System.out.println("처리 시간은 "+(endTime - startTime)+"ms" );
	}
}
