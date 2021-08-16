package Activity3;


import java.util.*;
import java.util.Map.Entry;

public class DisplayTeamMain3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfInputs = Integer.parseInt(sc.nextLine());
		
		Map<String, TeamPlayer3> map = new TreeMap<>();
		for (int i = 0; i < noOfInputs; i++) {
			String line = sc.nextLine();
			String[] lineArray = line.split("\\|");
			if (map.containsKey(lineArray[0])) {
				TeamPlayer3 obj = map.get(lineArray[0]);
				obj.addPlayer(lineArray[1]);
			}
			else {
				TeamPlayer3 obj = new TeamPlayer3(lineArray[0]);
				obj.addPlayer(lineArray[1]);
				map.put(lineArray[0], obj);
			}
		}
		System.out.println("Team and Players in ascending order");
		for (Entry<String, TeamPlayer3> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			//Collections.sort(entry.getValue().getPlayerList());
			for (PlayerProgram playerName : entry.getValue().getPlayerList()) {
				System.out.println("--"+playerName.getPlayerName());
			}
			
		}
		
		sc.close();

	}
	
	
	
	
}
