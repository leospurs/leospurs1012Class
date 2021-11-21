package object;

public class Player {

	private int playerId; // 선수ID
	private String playerName;	// 선수 이름
	private int playerAge;	// 선수 나이
	private String PlayerNatio;	// 선수 국적
	private int position;	// 선수 포지션
	
	// 생성자
	public Player(int playerId, String playerName, int playerAge, String playerNatio, int position) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerAge = playerAge;
		PlayerNatio = playerNatio;
		this.position = position;
	}
	
	
	// getter/setter 매소드
	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}

	public String getPlayerNatio() {
		return PlayerNatio;
	}

	public void setPlayerNatio(String playerNatio) {
		PlayerNatio = playerNatio;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerAge=" + playerAge
				+ ", PlayerNatio=" + PlayerNatio + ", position=" + position + "]";
	}
	
	
	
	
}
