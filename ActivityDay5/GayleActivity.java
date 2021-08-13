package Activity2;
import java.util.*;
public class GayleActivity {
	
	
	public static void main(String[] args) {
		
		int halfCentury = 0, century = 0;
		ArrayList<Integer> Scores = new ArrayList<Integer>();
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter number of matches");
		int n=userinput.nextInt();
		
		//int matchesplayed = Integer.parseInt(userinput.nextLine());
		System.out.println("Enter the scores");
		for(int i = 0; i < n; i++) {
			Scores.add(userinput.nextInt());
		}
		
		for (int score:Scores) {
			if(score>=100) {
				century++;
			}
			else if(score>=50) {
				halfCentury++;
			}
		}
		System.out.println(halfCentury);
		System.out.println(century);
	
	
	
}
}