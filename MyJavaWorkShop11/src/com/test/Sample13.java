package com.test;
import java.util.*;
class Food {}
class ChinaFood extends Food {}
class KoreanFood extends Food {}
public class Sample13 {
	public static void main(String[] args) {
		Food[] foods = new Food[3];
		foods[0] = new Food();
		foods[1] = new ChinaFood();
		foods[2] = new KoreanFood();
		
		ArrayList al = new ArrayList();
		al.add(new Food());
		al.add(new ChinaFood());
		al.add(new KoreanFood());
		al.add(new Food());
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}



