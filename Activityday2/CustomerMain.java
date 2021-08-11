
import java.util.Scanner;

public class CustomerMain{
public static void main(String args[]){

Customer sc=new Customer();
Scanner userinput = new Scanner(System.in);
		System.out.println("Enter the details");
		String i=userinput.nextLine();
		String j[];
		
		j=i.split(",");
		
sc.setName(j[0]);
sc.setAddress(j[1]);
sc.setMobile(j[2]);



//System.out.println("Details: ");
System.out.println("Name: "+sc.getName());
System.out.println("Address: "+sc.getAddress());
System.out.println("Mobileno: "+sc.getMobile());



}
}