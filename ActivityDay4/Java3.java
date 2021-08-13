package Activity1;

import java.util.Scanner;

import javax.naming.TeamNameNotFoundException;

public class Java3 {
	
	public static void main(String[] args) {
	String IPLteams="ChennaiSuperKings,SunRisersHyderabad,DelhiCapitals,KingsXIPunjab,KolkataKnightRiders,MumbaiIndians,RajasthanRoyal,RoyalChallengersBangalore";
		String IPLteam1	="Chennai Super Kings";

		String IPLteam2="Sun Risers Hyderabad";

		String IPLteam3="Delhi Capitals";

		String IPLteam4="Kings XI Punjab";

		String IPLteam5="Kolkata Knight Riders";

		String IPLteam6="Mumbai Indians";

		String IPLteam7="Rajasthan Royals";
		String IPLteam8="Royal Challengers Bangalore";
		
		
		System.out.println(" the expected winner team of IPL Season 13");
		Scanner ui=new Scanner(System.in);
		String input=ui.nextLine();
		int s1=IPLteams.length();
		int i=IPLteams.indexOf(input);
		
		if(i==-1) {
			
			System.out.println(" the expected winner team of IPL Season 13"+input);
		}
		else {
					throw new TeamNameNotFoundException();
		}
		
			
			System.out.println(" rcb");
			
			
}
		
		
	}
	
	

	
	


