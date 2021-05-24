package com.test;
import java.util.*;

public class Sample04 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(1);
		al.add(2);
		for(Integer i : al) {
			System.out.println(i);
			}
		List<Integer> al2 = new ArrayList<Integer>();
		List<Integer> al3 = new LinkedList<Integer>();
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "ÀÌ¼ø½Å");
		mp.put(2, "¼¼Á¾´ë¿Õ");
		mp.put(3, "È«±æµ¿");
		
		for(Integer k : mp.keySet()) {
			System.out.println(k + ", "+mp.get(k));
		}
		Set<Integer> set = mp.keySet();
		Set<Map.Entry<Integer, String>> set2 = mp.entrySet();
		Iterator itr = set2.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> e = 
					(Map.Entry<Integer, String>)itr.next();
			System.out.println(e.getKey()+", "+e.getValue());
		}
	}
}
