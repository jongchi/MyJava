package com.test;

import java.util.*;

public class Sample12 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		//List al2 = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		
		for(int inx = 0; inx < al.size(); inx++) {
			int a = (int)al.get(inx);
			System.out.println(a);
		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		LinkedList ll = new LinkedList();
		ll.add(300);
		ll.add(400);
		ll.add(500);
		
		Iterator itr2 = ll.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}




