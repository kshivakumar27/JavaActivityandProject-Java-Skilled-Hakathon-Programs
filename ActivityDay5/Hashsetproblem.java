package Activity2;
import java.util.*;
public class Hashsetproblem {
	public static void main(String[] args) {
		
		int totalmatch;
		HashSet<String> players = new HashSet<String>();
		Scanner userinput = new Scanner(System.in);
		totalmatch = Integer.parseInt(userinput.nextLine());
		for (int i = 0; i < totalmatch; i++) {
			players.add(userinput.nextLine());
		}
		System.out.println(players.size());
		

	
	
	
	
	
}
}