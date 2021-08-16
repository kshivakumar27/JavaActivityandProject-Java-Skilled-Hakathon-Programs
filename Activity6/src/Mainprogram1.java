package Activity3;
import java.util.*;
import java.util.Scanner;
public class Mainprogram1 {


	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Player> playerList = new ArrayList<Player>();
		String playerName;
		String[] skills = {"All Rounder", "Batsman", "Bowler"};
		int skillChoice;
		
		System.out.println("Please provide the number of players to be registered");
		int numberOfPlayers = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < numberOfPlayers; i++) {
			System.out.println("Please enter player name");
			playerName = sc.nextLine();
			System.out.println("Please select the skill of the player\n"
					+ "1.All Rounder\n"
					+ "2.Batsman\n"
					+ "3.Bowler");
			skillChoice = Integer.parseInt(sc.nextLine());
			
			if (skillChoice < 1 || skillChoice > 3) {
				System.out.println("Invalid Input");
				System.exit(0);
			}
			
			playerList.add(new Player(playerName, skills[ skillChoice - 1 ]));
		}
		Collections.sort(playerList, new Comparable1());
		System.out.println("Player Details");
		for (Player obj:playerList) {
			
			System.out.println(obj.toString());
		}
		sc.close();

	}

}