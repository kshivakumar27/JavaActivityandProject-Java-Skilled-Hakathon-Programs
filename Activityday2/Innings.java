
import java.util.Scanner; 

public class Innings{
	private String teamname;
	private String inningsname;
	private int runs;



	public void setTeamname(String teamname){
 	this.teamname=teamname;	
		}

	public String getTeamname(){
	 return teamname;
		}


	public void setInningsname(String inningsname){
		this.inningsname=inningsname;
		}
	public String getInningsname(){
	 return inningsname;
		}
	public void setRuns(int runs){
		this.runs=runs;
		}
	public int getRuns(){
	 return runs;
		}







public void displayInningsDetails() {
    Scanner userinput = new Scanner(System.in);
int count=1;
for(int i=1;i<3;i++){
if(i==1)
{

    System.out.println("Enter a  team name: ");
    setTeamname(userinput.nextLine()); 
  


System.out.println("Enter a Innings name: ");
    setInningsname(userinput.nextLine()); 
  

System.out.println("Enter a Runs: ");
    setRuns(userinput.nextInt()); 
 


System.out.println("Need"+this.getRuns()+count );
}


else
{
 System.out.println("Enter a  team name: ");
    setTeamname(userinput.nextLine()); 
 



System.out.println("Enter a Innings name: ");
    setInningsname(userinput.nextLine()); 
  

System.out.println("Enter a Runs: ");
    setRuns(userinput.nextInt()); 
  

}
}


}
}




