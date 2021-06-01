package ch11;

import java.util.*;

public class FootballPlayerList {

	public static void main(String[] args) {
		List<FootballPlayer> list = new ArrayList<>();
		
		list.add(new FootballPlayer("김공격", 7, "FC서울", 25));
		list.add(new FootballPlayer("이수비", 13, "울산현대", 28));
		list.add(new FootballPlayer("박미드", 9, "이랜드", 27));
		list.add(new FootballPlayer("황키퍼", 11, "수원삼성", 22));
		
		Iterator<FootballPlayer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
