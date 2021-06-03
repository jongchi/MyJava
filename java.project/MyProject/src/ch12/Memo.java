package ch12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Memo {
	static File memoFile = new File("C:"+File.separator+"memo");
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Memo memo = new Memo();
		// ①File 클래스를 이용해서 저장 폴더 생성
		
		if(!memoFile.exists()) {
			memoFile.mkdir();
			System.out.println("메모파일 폴더를 생성했습니다.");
		}
		while(true) {
			System.out.println("******메모 파일********");
			System.out.println("1. 메모 파일 저장");
			System.out.println("2. 메모 파일 리스트 보기");
			System.out.println("3. 메모 파일 읽기");
			System.out.println("4. 프로그램 종료");		
			System.out.println("--------------------");		
			System.out.println("사용하실 기능을 입력해주세요.");
			String number = scanner.nextLine();
			int num = Integer.parseInt(number);
			switch(num) {	
			case 1: 
				memo.writeFile(); 
				break;
			case 2:
				memo.showDir();
				break;
			case 3:
				memo.readFile();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			
			}	
		}

	}

		
	void writeFile() { // 제목,날짜,내용을 받아 파일 저장
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
		String today = dateFormat.format(date);
		
		// ②문자기반 스트림을 이용해서 날짜와 제목, 메모를 파일에 저장
		
		System.out.println("제목을 입력해주세요. ");
		String title = scanner.nextLine();
		System.out.println("제목은 "+title+" 입니다.");
		System.out.println("메모를 입력해주세요.");
		String content = scanner.nextLine();
		
		try {
			// ③파일의 이름은 날짜와 메모의 제목을 이용해서 생성
			BufferedWriter out = new BufferedWriter(new FileWriter(memoFile+File.separator+title+"_"+today+".txt"));
			
			out.write(content);
			
			out.close();
			System.out.println(title+"_"+today+"파일이 생성되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	void showDir() {
		if(!memoFile.exists()) {
			System.out.println("폴더가 존재하지 않습니다.");
		} else {
			File files[] = memoFile.listFiles();
			for(int i=0;i<files.length;i++) {
				System.out.println("파일명 :"+i+". "+files[i].getName());
			}
		}
		}
	
	
	void readFile() {
		try {
			System.out.println("열어볼 파일 이름을 입력해주세요.");
			String selMemo = scanner.nextLine();
			BufferedReader in = new BufferedReader(new FileReader(memoFile+File.separator+selMemo+".txt"));
			String str = null;
			
			while(true) {
				str = in.readLine();
				
				if(str == null)	{
					break;
				}
				System.out.println(str);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}


