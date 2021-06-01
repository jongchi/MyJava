package ch11;

import java.util.*;

public class FootballPlayerMap {
	public static void main(String[] args) {
		// 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 
		// Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다. 
		HashMap<Integer, FootballPlayer> players = new HashMap();
			players.put(7, new FootballPlayer("Son", 7, "Tot", 27));
			players.put(10,new FootballPlayer("Kane", 10, "Tot", 26));
			players.put(20, new FootballPlayer("Kane2", 20, "Tot", 16));
			
			Set<Integer> set = players.keySet();
			
			Iterator<Integer> itr = set.iterator();
			while(itr.hasNext()) {
				System.out.println(players.get(itr.next()));
			}

	}
}
