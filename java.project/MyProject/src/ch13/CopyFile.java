package ch13;

import java.io.File;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) {



		//②파일이 복사가 완료되면 완료 메시지를 콘솔에 출력합시다.
		Scanner scanner = new Scanner(System.in);
		while(true) {
			//복사해올 위치의 경로
			System.out.print("복사한 파일이 저장될 경로를 입력해주세요. : ");
			String copyFilePath = scanner.nextLine();
			File copyFile = new File(copyFilePath);
			
			if(!copyFile.exists()) {
				System.out.println("폴더가 존재하지 않습니다.");
				copyFile.mkdir();
				System.out.println("새로운 폴더" + copyFile + "를 생성합니다.");
			} 
			
			//복사할 파일의 경로
			System.out.print("복사할 대상 파일의 경로를 입력해주세요. : ");	
			String fileName = scanner.nextLine();
			File originFile = new File(fileName);
			
			// 데이터 복사 스레드
			CopyFileThread copyThread = new CopyFileThread(originFile, copyFile);
			
			copyThread.start();
			try {
				copyThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
