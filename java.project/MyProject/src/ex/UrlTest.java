package ex;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest {
	public static void main(String[] args) {
		String urlStr = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=014&aid=0004651107";

		try {
			URL url = new URL(urlStr);
			
			System.out.println("Protocol : "+url.getProtocol() );
			System.out.println("Host Name : "+url.getHost());
			System.out.println("Port Num : "+url.getPort());
			System.out.println("DefaultPortNum : "+url.getDefaultPort());
			System.out.println("Query : "+url.getQuery());
			System.out.println("Path : "+url.getPath());
			System.out.println("File : "+url.getFile());
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
