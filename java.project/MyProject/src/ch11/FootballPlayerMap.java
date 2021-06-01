package ch11;

import java.util.*;

public class FootballPlayerMap {
	public static void main(String[] args) {
		HashMap<Integer, FootballPlayer> map = new HashMap();
			map.put(7, new FootballPlayer("김미드", 7, "이랜드", 27));
			map.put(11, new FootballPlayer("박공격", 11, "이랜드", 23));
			map.put(13, new FootballPlayer("이수비", 15, "울산현대", 28));
			
			for(Integer key : map.keySet())
			System.out.println(map.get(key));

	}
}
