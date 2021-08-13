package Activity1;
import java.util.*;


public class Java2 {
 



public static void main(String[] args) {
	
	
int overs,runs;

Scanner userinput = new Scanner(System.in);
System.out.println("Enter the no of overs");
try {
	
	overs = Integer.parseInt(userinput.nextLine());
	int[] arr = new int[overs];

System.out.println(":enter  ");
int a=userinput.nextInt();

System.out.println("Enter a RunScored in each overs: ");
for(int i=0;i<overs;i++) {
	
	arr[i]=userinput.nextInt();
}

System.out.println("Enter the over no : ");

int n=userinput.nextInt();

System.out.println("Enter a total overs faced:: " +arr[n-1]);


}
 catch(Exception e) {
// TODO Auto-generated catch block
	 	System.out.println(e);
}
userinput.close();
	
}	
	
	
}	


