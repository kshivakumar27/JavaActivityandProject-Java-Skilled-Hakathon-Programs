import java.util.Scanner;
public class problem3{ 
public static void main(String[] args) { 

int n,rem,prod=1; 
Scanner in=new Scanner(System.in); 
n = in.nextInt(); 
if(n<0 || n>32767) { 
System.out.println("Invalid Input"); 
System.exit(0); 
}
else
{         
while(n!=0)
{
	rem=n%10;
	prod=prod*rem;
	n=n/10;
}
System.out.println(prod);
}
}
}