package ch13;

import java.util.Random;
import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {



		
		
		
		Random random = new Random();	
		Scanner scanner = new Scanner(System.in);
		
		// ① 1~100 사이의 랜덤 한 숫자를 추출합니다
		int correct = random.nextInt(100);
		
		// ④ 10초 이전에 맞추면 미션 성공, 10초가 지나면 프로그램 종료하는 흐름으로 만들어봅시다.
		CountDownThread countDown = new CountDownThread();
		countDown.start();
		
		// ② 사용자에게 숫자를 입력 받고, 랜덤 숫자와 비교하고, 높은 숫자인지 낮은 숫자인지 출력
		while(true) {
			System.out.println("----------------------------------------------------------");
			System.out.print("숫자를 입력해주세요 : \n");
			int input = scanner.nextInt();
			if(input>correct) {
				System.out.printf("입력하신 숫자는 %d 이며 정답은 입력하신 숫자보다 작습니다. \n",input);
			} if(input<correct) {
				System.out.printf("입력하신 숫자는 %d 이며 정답은 입력하신 숫자보다 큽니다. \n",input);
			} else if(input==correct){
				System.out.printf("축하합니다. 정답을 맞췄습니다. 정답은 %d 입니다. \n",input);
				System.out.println("프로그램을 종료합니다.");
				return;
			}			
		}

	}	
}
