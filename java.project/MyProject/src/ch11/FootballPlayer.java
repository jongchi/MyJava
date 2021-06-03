package ch11;


public class FootballPlayer implements Comparable<FootballPlayer> {
	private String name;
	private int number;
	private String team;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public FootballPlayer(String name, int number, String team, int age){
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}
	
	public String toString() { 
		return "FootballPlayer [ name : "+name+" number : "+number+" team : "+team+" age : "+ age+" ] ";
	}
	
	public int hashCode() {
		return this.age % 10;
	}
	
	public boolean equals(Object obj) {
		// 팀과 이름 그리고 나이가 같으면 같은 선수라 판단
		boolean chk = false;
		if(obj != null && obj instanceof FootballPlayer) {
			FootballPlayer player = (FootballPlayer)obj;
			if(this.team.equals(player.team) && this.name.equals(player.name) && (this.age == player.age)) {
				chk = true;
			}	
		} return chk;
	}

	@Override
	public int compareTo(FootballPlayer o) {
		if(this.team.compareTo(o.team)>0) { // 팀 이름으로 비교
			return 1;
		} else if(this.team.compareTo(o.team)<0) {
			return -1;
		} else {	// 팀 이름이 같을 때
			if(this.name.compareTo(o.name)>0) { // 선수 이름으로 비교
				return 1;
			} else if(this.name.compareTo(o.name)<0) {
				return -1;
			} else { // 선수 이름이 같을 때
				return this.number - o.number; // 번호가 빠를수록 먼저 나오도록 정의
			} 
		}
	}
}
