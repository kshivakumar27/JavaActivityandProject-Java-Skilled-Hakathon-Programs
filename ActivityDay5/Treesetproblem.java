package Activity2;
import java.util.*;
public class Treesetproblem {
	
	
	public static void main(String[] args) {
		
		int totalmatches;
		TreeSet<String> players = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		totalmatches = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < totalmatches; i++) {
			players.add(sc.nextLine());
		}
		
		for (String playerName:players) {
			System.out.println(playerName);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
