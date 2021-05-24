package com.test;

import java.util.regex.*;

public class Sample11 {

	public static void main(String[] args) {
		String[] data = {
				"bat", "batman", "bonus"
		};
		Pattern p = Pattern.compile("[a-z0-9][a-z]");
		for(String s : data) {
			Matcher m = p.matcher(s);
			if(m.matches()) {
				System.out.println(s);
			}				
		}

	}

}
