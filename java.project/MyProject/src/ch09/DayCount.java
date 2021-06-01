package ch09;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayCount {
	public static void main(String[] args) {
		Calendar birthDay = new GregorianCalendar(1991, Calendar.JULY, 21); // 생일 입력
		Calendar today = new GregorianCalendar(); // 오늘 날짜 입력
		
		long diffSec = (today.getTimeInMillis() - birthDay.getTimeInMillis())/1000; // 오늘에서 생일을 뺀후 ms를 초로 변환
		long diffDays = diffSec / (24*60*60);
		
		System.out.println("생일부터 현재까지 총 "+ diffDays +"일 경과했습니다.");
	}
}
