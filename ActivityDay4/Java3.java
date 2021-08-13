package Activity1;

import java.util.Scanner;
import java.util.*;




class TeamNameNotFoundException extends Exception{
	public TeamNameNotFoundException(String str) {
		super(str);
	}
}


public class Java3 {
	
	public static void main(String[] args) throws TeamNameNotFoundException{
		String runner,winners;
		
		Scanner ui=new Scanner(System.in);
	
	String IPLteams[]={"ChennaiSuperKings","SunRisersHyderabad","DelhiCapitals","KingsXIPunjab","KolkataKnightRiders","MumbaiIndians","RajasthanRoyal","RoyalChallengersBangalore"};
	try {
		System.out.println(" the expected winner team of IPL Season 13");
		
		String input=ui.nextLine();
		
		if(!Arrays.asList(IPLteams).contains(winners)) {
			throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 13");
		}
		
		System.out.println("Enter the expected runner Team of IPL Season 13");
		runner= ui.nextLine();
		if(!Arrays.asList(IPLteams).contains(runner)) {
			throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 13");
		}
		
		System.out.println("Expected IPL Season 13 winner: " +winners);
		System.out.println("Expected IPL Season 13 runner: " +runner);
	} catch (TeamNameNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
}
		
		
	}
	
	

	
	


