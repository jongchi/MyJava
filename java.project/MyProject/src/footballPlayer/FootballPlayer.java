package footballPlayer;


public class FootballPlayer implements Comparable<FootballPlayer> {
	String name;
	int number;
	String team;
	int age;
	
	FootballPlayer(String name, int number, String team, int age){
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}
	
	public String toString() { 
		return "이름 : "+name+" 등번호 : "+number+" 소속 팀 : "+team+" 나이 : "+ age;
	}
	
	public int hashCode() {
		return this.age % 3;
	}
	
	public boolean equals(Object obj) {
		
		boolean result = false;
		if(obj != null && obj instanceof FootballPlayer) {
			FootballPlayer player = (FootballPlayer)obj;
			if((this.name == player.name) 
					&& (this.team == player.team) && (this.age == player.age)) {
				result = true;
			}	
		} return result;
	}

	@Override
	public int compareTo(FootballPlayer o) {
		int teamResult = this.team.compareTo(o.team); // 팀이름으로 비교
		int nameResult = this.name.compareTo(o.name); // 선수이름으로 비교
		if(teamResult>0) {
			return 1;
		} else if(teamResult<0) {
			return -1;
		} else {
			if(nameResult>0) {
				return 1;
			} else if(nameResult<0) {
				return -1;
			} else if(nameResult == 0) {
				return this.number - o.number; // 번호가 빠를수록 먼저 나오도록 정의
			} else return 0;
		}
	}
}
