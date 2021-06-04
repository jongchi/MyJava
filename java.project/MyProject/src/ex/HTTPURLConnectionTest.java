package ex;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPURLConnectionTest {

	public static void main(String[] args) {
		String urlStr = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=014&aid=0004651107";

		try {
			URL url = new URL(urlStr);
			
			// httpURLConnection : url.openconnection();
			HttpURLConnection hcon = (HttpURLConnection)url.openConnection();
			
			for(int i = 1 ; i<=8; i++) {
				System.out.print(hcon.getHeaderFieldKey(i));
				System.out.println(" : " + hcon.getHeaderField(i));
			}
		hcon.disconnect();	
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
