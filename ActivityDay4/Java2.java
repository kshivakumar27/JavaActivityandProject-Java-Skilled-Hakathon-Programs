package Activity1;

import java.util.Scanner;

public class Java2 {
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










public static void main(String[] args) {
	
	
	Java2 jj=new Java2();

int i=0,n=0,b=0;

Scanner userinput = new Scanner(System.in);

int arr[] =new int[5];



System.out.println("Enter the no of overs: ");
int a=userinput.nextInt();

System.out.println("Enter a RunScored in each overs: ");
for( i=0;i<a;i++) {
	
	arr[i]=userinput.nextInt();
}

System.out.println("Enter the over no : ");

n=userinput.nextInt();

//try(){
if(n==arr[i]) {
	System.out.println("Enter a total overs faced:: "+arr[i]);
}

else {

	throw new ArrayIndexOutOfBoundsException();

} 
	
}	
	
	
}	


