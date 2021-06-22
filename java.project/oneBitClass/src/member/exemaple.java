package member;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class exemaple {
	public static void main(String[] args) {
		String string = "21/6/21";
		DateFormat format = new SimpleDateFormat("yy/MM/dd");
		try {
			Date date = format.parse(string);
			System.out.println(date);
			String result = format.format(date);
			System.out.println(result);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
