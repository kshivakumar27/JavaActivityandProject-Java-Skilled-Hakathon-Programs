package Activity2;

import java.util.*;

public class Javacollections {

	
	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		ArrayList<String> cricket = new ArrayList<String>();
		
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		for (int i = 0; i < 5; i++) {
			String s = userinput.nextLine();
			cricket.add(s);
		}
		
		ArrayList<String> cricket1 = new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		for (int i = 0; i < 5; i++) {
			String s = userinput.nextLine();
			cricket.add(s);
		}
	//	cricket.retainAll(cricket);
	//	System.out.println("Consistent run scorers");
	//	for (String playerName : cricket) {
	//		System.out.println(playerName);
	//	}
		for(String i:cricket) {
			for(String j:cricket) {
				if(i.equals(j)) {
					System.out.println(i);
				}
	}
	
	
	
		}
	}
}
