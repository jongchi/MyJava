package com.test;
import java.util.*;

public class Sample02 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("이순신");
		al.add("강감찬");
		al.add(12.5);
		al.set(0, "세종대왕");
		Object obj = al.get(0);
		System.out.println(obj.getClass().getName());
		Object obj2 = al.get(1);
		System.out.println(obj2.getClass().getName());	
		al.size();
		for(int inx = 0; inx < al.size(); inx++) {
			Object o = al.get(inx);
			System.out.println(o.toString());
		}
		HashSet h = new HashSet();
		h.add("홍길동");
		h.add("이순신");
		h.add("홍길동");
		
		Iterator itr = h.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
