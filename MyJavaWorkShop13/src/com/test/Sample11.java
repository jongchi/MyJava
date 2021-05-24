package com.test;

import java.util.*;

class MyData implements Comparable<MyData>{
	private int a;
	MyData(int a){
		this.a = a;
	}
	public int getA() { return this.a;	}
	
	@Override
	public int compareTo(MyData o) {
		if(this.a < o.a) {
			return -1;
		} else if (this.a > o.a) {
			return 1;
		} else {
			return 0;
		}
	
	}
}
public class Sample11 {
	public static void main(String[] args) {
		MyData m1 = new MyData(2);
		MyData m2 = new MyData(1);
		MyData m3 = new MyData(4);
		MyData m4 = new MyData(3);
		
		ArrayList<MyData> mlist = new ArrayList<MyData>();
		mlist.add(m1);
		mlist.add(m2);
		mlist.add(m3);
		mlist.add(m4);
		Collections.sort(mlist);
		for(MyData m : mlist) {
			System.out.println(m.getA());
		}

	}

}
