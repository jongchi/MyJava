package com.test4;
import java.util.*;

public class ArrayListEx1 {
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list 1"+list1);
		System.out.println("list 2"+list2);
		System.out.println();
		
	}
	public static void main(String[] args) {
		ArrayList list = new ArrayList(10);
		list.add(new Integer(5));
		list.add(new Integer(3));
		list.add(new Integer(7));
		list.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		print(list, list2);
		
		Collections.sort(list);
		Collections.sort(list2);
		print(list, list2);
		
		System.out.println("list.containsAll(list2):" +list.contains(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add("A");
		print(list, list2);
		
		list2.set(3, "AA");
		print(list, list2);
		
		System.out.println("list1.retainAll(list2)"+ list.retainAll(list2));
		print(list, list2);
		
		for(int i = list2.size()-1; i>=0; i--) {
			if(list.contains(list2.get(i))) {
			list2.remove(i);}
		}
		print(list, list2);
	}

}
