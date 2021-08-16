package Activity3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class TeamPlayer3 {
	
	
	
	
	private String teamName;
	private List<PlayerProgram> playerList = new ArrayList<PlayerProgram>();
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public List<PlayerProgram> getPlayerList() {
		Collections.sort(playerList);
		return playerList;
	}
	public void setPlayerList(List<PlayerProgram> playerList) {
		this.playerList = playerList;
	}
	/**
	 * @param teamName
	 */
	public TeamPlayer3(String teamName) {
		this.teamName = teamName;
	}
	public void addPlayer (String playerName) {
		playerList.add(new PlayerProgram(playerName));
	}
	
	

}
