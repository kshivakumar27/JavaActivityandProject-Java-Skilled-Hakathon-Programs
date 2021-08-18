package JavaCruddb;

public class player {
	
	
	
	
	int playernumber;
	String playername;
	String country;
	String skill;
	String mobile;
	public int getPlayernumber() {
		return playernumber;
	}
	public void setPlayernumber(int playernumber) {
		this.playernumber = playernumber;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public player(int playernumber, String playername, String country, String skill, String mobile) {
		super();
		this.playernumber = playernumber;
		this.playername = playername;
		this.country = country;
		this.skill = skill;
		this.mobile = mobile;
	}
	
	
	
		   @Override
	public String toString() {
		return "Player [playernumber=" + playernumber + ", playername=" + playername + ", country=" + country
				+ ", skill=" + skill + ", mobile=" + mobile + "]";
	}
		public void displayDetails(){
			   System.out.println("Name: "+this.playernumber);
		      System.out.println("Name: "+this.playername);
		      System.out.println("Age: "+this.country);
		      System.out.println("Id: "+this.skill);
		      System.out.println("Name: "+this.mobile);
		   }
		}

