package thread;

public class ShowThread extends Thread{
		 
		String tName;
		
		ShowThread(String name){
			this.tName = name;
		};

		public void run() {
			for(int i=0; i<100; i++) {
				System.out.println("안녕하세요~!! "+ tName + "입니다.");
		
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
		
}

