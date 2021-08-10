import java.util.Scanner;
public class problem3{ 



static int productDigits(int num)
	{
		int product=1,n;
		while(num>0)
		{
		n=num%10;
		product*=n;
		num/=10;
		}
		return product;

	}

public static void main(String[] args) { 
int n,rem; 
Scanner in=new Scanner(System.in); 
System.out.println("Enter the numbers ");
n = in.nextInt(); 
if(n<0 || n>32767) { 
	System.out.println("Invalid Input");
 
	System.exit(0); 
	}
else
	{  
	int product;
      	product=productDigits(n);
	System.out.println(product);


	}
}
}			
		