package ch11;

import java.util.*;

public class FootballPlayerTreeSet {
	public static void main(String[] args) {
		
		// 3. TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 
		// 같은 팀의 선수들은 이름 순으로 정렬하고, 
		// 같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다.
		TreeSet<FootballPlayer> players = new TreeSet<>();
		
		//데이터 저장
		players.add(new FootballPlayer("Son1", 7, "Tot", 27));
		players.add(new FootballPlayer("Park1", 7, "Man", 37));
		players.add(new FootballPlayer("Son1", 9, "Tot", 27));
		players.add(new FootballPlayer("Son2", 20, "Tot", 37));
		players.add(new FootballPlayer("Park2", 20, "Man", 31));
		players.add(new FootballPlayer("Park2", 21, "Man", 31));
	
		System.out.println("요소의 개수 : "+ players.size());
		
		Iterator<FootballPlayer> itr = players.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
