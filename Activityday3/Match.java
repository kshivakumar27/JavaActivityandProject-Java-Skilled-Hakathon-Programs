import java.util.Scanner;

public class Match{
public static void main(String args[]){

ODIMatch s1=new ODIMatch();
T20Match s2=new T20Match();
TestMatch s3=new TestMatch();
//s1.displayInfo1();




//s2.displayInfo2();



//System.out.println("Verify and Update the details");
		int input=1;
Scanner scanner=new Scanner(System.in);
		//input=scanner.nextInt();
		while(input!=4)
		{
			System.out.println("Match Type");
			System.out.println("1. ODI");
			System.out.println("2. T20");
			System.out.println("3. Test");
			System.out.println("4. Exit");
			
			input=scanner.nextInt();
			switch(input)
			{
			case 1:
				s1.displayInfo1();




System.out.println("--- Match details--- ");


System.out.println("Current run score: "+s1.getCurrentscore());
System.out.println("Current over: "+s1.getCurrentover());
System.out.println("Target: "+s1.getScore());
double r=50-s1.getCurrentover();
double rr=s1.getScore()-s1.getCurrentscore();
double a=(r/rr);
System.out.println("Need :"+s1.getScore()+" from "+50);
System.out.println("Required run rate :"+a);
				break;
			case 2:	
				s2.displayInfo2();

System.out.println("--- Match details--- ");


System.out.println("Current run score: "+s2.getCurrentscore());
System.out.println("Current over: "+s2.getCurrentover());
System.out.println("Target: "+s3.getScore());
double r=20-s1.getCurrentover();
double rr=s1.getScore()-s1.getCurrentscore();
double a=(r/rr);
System.out.println("Need :"+s1.getScore()+" from "+20);
System.out.println("Required run rate :"+a);


				break;

			case 3:	
				s3.displayInfo3();

System.out.println("--- Match details--- ");


System.out.println("Current run score: "+s3.getCurrentscore());
System.out.println("Current over: "+s3.getCurrentover());
System.out.println("Target: "+s3.getScore());
double r=90-s1.getCurrentover();
double rr=s1.getScore()-s1.getCurrentscore();
double a=(r/rr);
System.out.println("Need :"+s1.getScore()+" from "+90);
System.out.println("Required run rate :"+a);











				break;	

	
			
			default:
				
				break;
					
			}
		}
		
	
	}
}



