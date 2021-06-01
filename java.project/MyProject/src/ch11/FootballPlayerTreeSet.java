package ch11;

import java.util.*;

public class FootballPlayerTreeSet {
	public static void main(String[] args) {
		TreeSet<FootballPlayer> treeSet = new TreeSet<>();
		
		treeSet.add(new FootballPlayer("강공격", 7, "가팀",27));
		treeSet.add(new FootballPlayer("김수비", 10, "나팀",24));
		treeSet.add(new FootballPlayer("강공격", 85, "다팀",25));
		treeSet.add(new FootballPlayer("나미드", 9, "가팀",29));
		treeSet.add(new FootballPlayer("나미드", 20, "가팀",23));
		treeSet.add(new FootballPlayer("박키퍼", 13, "가팀",30));
	
		Iterator<FootballPlayer> itr = treeSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
