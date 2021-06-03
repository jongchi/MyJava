package ch13;

import thread.ThreadEx1;
// ③ 10초 카운팅은 스레드를 이용해서 처리해봅시다.
public class CountDownThread extends Thread{

		@Override
		public void run() {
			for(int i=10;i>0;i--) {
				if(ThreadEx1.chk) {
					return;
				}
				System.out.println("남은시간 : "+ i);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
			System.out.println("입력시간이 지나 프로그램을 종료합니다.");
			System.exit(0);
		}

	}

