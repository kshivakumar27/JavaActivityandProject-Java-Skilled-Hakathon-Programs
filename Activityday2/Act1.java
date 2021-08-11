import java.util.Scanner;
public class Act1 {
 
public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name");
		String fn = sc.nextLine();
		System.out.println("Enter the second name");
		String ln = sc.nextLine();
		
		String frst = fn.substring(0, 1);
		String rem = fn.substring(1);
		
		frst = frst.toUpperCase();
		rem = rem.toLowerCase();
		String name = frst + rem; 
		
		String sec=ln.toUpperCase();
		
		System.out.println(name+" " + sec);
    }

}