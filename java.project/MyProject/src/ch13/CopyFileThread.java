package ch13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileThread extends Thread{
	File originFile;
	File copyFile;
	
	CopyFileThread(File org, File copy){
		this.originFile = org;
		this.copyFile = copy;
	}
	
	public void run() {
		try {
			InputStream in = new FileInputStream(originFile);
			OutputStream out = new FileOutputStream(copyFile+File.separator+originFile);
			
			byte[] buf = new byte[1024]; // 파일에서 읽어올 바이트 배열
			int readLen = 0;
			
			while(true) {
				readLen = in.read(buf);
				if(readLen == -1) {
					break;
				}
				
				out.write(buf, 0, readLen);
				
			}
			
			in.close();
			out.close();
			
			System.out.println("복사가 완료되었습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
