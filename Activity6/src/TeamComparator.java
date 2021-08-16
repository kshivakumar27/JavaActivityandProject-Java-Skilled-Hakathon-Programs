package Activity3;

import java.util.Comparator;
public class TeamComparator implements Comparator<Team> {


		public int compare(Team o1, Team o2) {
			// TODO Auto-generated method stub
			return (int)(o1.getNumberOfMatches() - o2.getNumberOfMatches());
		}
	
	
	
	
}
