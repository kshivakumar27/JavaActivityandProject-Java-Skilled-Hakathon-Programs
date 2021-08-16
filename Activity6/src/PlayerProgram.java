package Activity3;

public class PlayerProgram  implements Comparable<PlayerProgram>{

	private String playerName;
	
	
	
		public PlayerProgram(String playerName2) {
		// TODO Auto-generated constructor stub
	}

		public String getPlayerName() {
		return playerName;
	}

		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}

		public int compareTo(PlayerProgram o) {
			// TODO Auto-generated method stub
			return this.playerName.compareTo(o.getPlayerName());
		}
	
	
}
