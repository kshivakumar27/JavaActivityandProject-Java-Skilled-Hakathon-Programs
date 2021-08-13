package Activity1;
import java.util.Scanner;

public class Java1 {
 private int Runscored;
 private float over;
	
	
public int getRunscored() {
	return Runscored;
}


public void setRunscored(int runscored) {
	Runscored = runscored;
}


public float getOver() {
	return over;
}


public void setOver(float over) {
	this.over = over;
}






public void displayInfo1() {	
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter a RunScored: ");
    setRunscored(userinput.nextInt()); 
   


System.out.println("Enter a total overs faced: ");
    setOver(userinput.nextInt()); 




}



public static void main(String[] args) {
	
	
	Java1 jj=new Java1();
jj.displayInfo1();
System.out.println("Enter a RunScored: "+jj.getRunscored());
System.out.println("Enter a total overs faced:: "+jj.getOver());
double rr=400-jj.getRunscored();
double r=50-jj.getOver();
//String[] a= [a,b,c,d,e,f,j,h,i,j,k,l,m,n,o,p];
double a=(r/rr);
if(jj.getOver()==0) {
	throw new ArithmeticException();
	
}
//else{
//	int n=Integer.parseInt(null){
		
//	}
//}

System.out.println("Required run rate :"+a);
	
	
	
	
	
	System.out.println();
}
}
