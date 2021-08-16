package Activity3;

public class Team {
	
	private String teamName;
	private long numberOfMatches;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public long getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(long numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public Team(String teamName, long numberOfMatches) {
		super();
		this.teamName = teamName;
		this.numberOfMatches = numberOfMatches;
	}
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", numberOfMatches=" + numberOfMatches + "]";
	}
	
	
	
	
	

}
