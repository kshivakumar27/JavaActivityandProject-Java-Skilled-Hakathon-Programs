import java.util.Scanner;  
public class TestMatch extends Match {
	private int currentscore;
	private float currentover;
	private int score;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}


public void displayInfo3() {	
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter a CurrentScore: ");
    setCurrentscore(userinput.nextInt()); 
   


System.out.println("Enter a current over: ");
    setCurrentover(userinput.nextInt()); 


System.out.println("Enter a Score: ");
    setScore(userinput.nextInt()); 



}






	

}
