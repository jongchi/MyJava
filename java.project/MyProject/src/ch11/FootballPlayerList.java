package ch11;

import java.util.*;

public class FootballPlayerList {

	public static void main(String[] args) {
		// 1. 축구선수 인스턴스를 저장할 수 있는 
		// List<E> 컬렉션 인스턴스를 생성해서 
		//  인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다. 
		List<FootballPlayer> players = new ArrayList<>();
		
		// 데이터 저장 
		players.add(new FootballPlayer("Son1", 7, "Tot", 27));
		players.add(new FootballPlayer("Park1", 7, "Man", 37));
		players.add(new FootballPlayer("Son1", 9, "Tot", 27));
		players.add(new FootballPlayer("Son2", 20, "Tot", 37));
		players.add(new FootballPlayer("Park2", 20, "Man", 31));
		players.add(new FootballPlayer("Park2", 21, "Man", 31));
		
		// 정렬
		Iterator<FootballPlayer> itr = players.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
