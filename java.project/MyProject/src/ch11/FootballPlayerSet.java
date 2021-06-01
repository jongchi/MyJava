package ch11;

import java.util.*;

public class FootballPlayerSet {
	public static void main(String[] args) {
		// 2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 
		// 같은 선수라 판단하고 입력이 되지 않도록 
		// Set<E> 컬렉션을 이용해서 축구선수 인스턴스를 저장하고 
		// 출력하는 프로그램을 만들어 봅시다.
		Set<FootballPlayer> players = new HashSet<>();
		
		
		players.add(new FootballPlayer("Son1", 7, "Tot", 27));
		players.add(new FootballPlayer("Park1", 7, "Man", 37));
		players.add(new FootballPlayer("Son1", 9, "Tot", 27));
		players.add(new FootballPlayer("Son2", 20, "Tot", 37));
		players.add(new FootballPlayer("Park2", 20, "Man", 31));
		players.add(new FootballPlayer("Park2", 21, "Man", 31));
		
		System.out.println("요소의 개수 : "+ players.size());
		Iterator<FootballPlayer> itr = players.iterator();
		// 정렬 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
