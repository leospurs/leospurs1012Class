package object;

public class Team {
	
	private String TeamName; // 팀 이름
	private String location; // 팀 연고지
	private String coachName; // 감독
	private int division;	// 리그(1. 프리미어 리그 2. 챔피언쉽 리그
	
	// 생성자
	public Team(String teamName, String location, String coachName, int division) {
		super();
		TeamName = teamName;
		this.location = location;
		this.coachName = coachName;
		this.division = division;
	}
	
	// 매개변수가 없는 생성자
	public Team() {}
	
	// getter/setter 메소드
	public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		TeamName = teamName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public int getDivision() {
		return division;
	}

	public void setDivision(int division) {
		this.division = division;
	}
	
	// 팀 정보 조회 시 정보노출을 위한  toString 메소드
	@Override
	public String toString() {
		return "Team [TeamName=" + TeamName + ", location=" + location + ", coachName=" + coachName + ", division="
				+ division + "]";
	}
	
	
	
	
	
	
	
}
