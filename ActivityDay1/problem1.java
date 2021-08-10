import java.util.Scanner; 
public class problem1 { 

static double calculateSal(double salary,double shifts){
double savings=0;
savings = (salary*0.5)+(salary*0.02*shifts); 
return savings;

}

public static void main(String[] args) { 
double salary=0,shifts=0; double savings=0;
System.out.println("Enter salary and Shift "); 
Scanner in=new Scanner(System.in); 
salary = in.nextInt(); 
shifts = in.nextInt(); 
if(salary > 8000) 
	System.out.println("Salary too large "); 
else if(shifts<0) 
	System.out.println("Shifts too small\n"); 
else if(salary<0) 
	System.out.println("Salary too small"); 
else { 
	savings=calculateSal(salary,shifts);
	System.out.println(savings);
} 



 
}

}


