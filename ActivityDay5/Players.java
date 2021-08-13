package Activity2;

public class Players implements Comparable<Players> {
	
	private String playernames;
	private int sn;

	public Players(String string) {
		// TODO Auto-generated constructor stub
	}

	public Players(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}


	public String getPlayernames() {
		return playernames;
	}

	public void setPlayernames(String playernames) {
		this.playernames = playernames;
	}

	@Override
	public int compareTo(Players o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
