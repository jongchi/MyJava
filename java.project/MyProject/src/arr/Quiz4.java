package arr;

import java.util.Scanner;

public class Quiz4 {

		public static int miniValue(int[] arr) {	// 최소값 반환
			int min = arr[0];
			for(int e : arr) {
				if(e<=min) {
					min = e;
				}
			}
			return min;
		}
		
		public static int maxValue(int[] arr) {	// 최대값 반환
			int max = 0;
			for(int e : arr) {
				if(e>=max) {
					max = e;
				}
			}
			return  max;
		}
		public static void main(String[] args) {
			int[] arr = new int[5];
			Scanner scanner = new Scanner(System.in);
			System.out.println("다섯 개의 숫자를 입력해주세요.");
			for(int i = 0; i<5; i++) {
				System.out.print((i+1)+"번 숫자 입력 : ");
				arr[i] = scanner.nextInt();
			}
			System.out.println("배열의 최대값 : " + maxValue(arr));	
			System.out.println("배열의 최소값 : " + miniValue(arr));
			

		}
}
