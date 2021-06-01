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
			if(this.name == player.name) {
				if(this.team == player.team) {
					if(this.age == player.age) {
						result = true;
					}
				}
			}
		} return result;
	}

	@Override
	public int compareTo(FootballPlayer o) {
		int teamResult = this.team.compareTo(o.team);
		int nameResult = this.name.compareTo(o.name);
		if(teamResult>0) {
			return 1;
		} else if(teamResult<0) {
			return -1;
		} else {
			if(nameResult>0) {
				return 1;
			} else if(nameResult<0) {
				return -1;
			} else if(nameResult ==0) {
				return this.number - o.number;
			} else return 0;
		}
	}
}
