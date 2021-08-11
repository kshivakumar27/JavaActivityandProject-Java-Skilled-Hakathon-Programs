
import java.util.Scanner; 

public class Employee{
	private String name;
	private String address;
	private String mobile;



	public void setName(String name){
 	this.name=name;	
		}

	public String getName(){
	 return name;
		}


	public void setAddress(String address){
		this.address=address;
		}
	public String getAddress(){
	 return address;
		}
	public void setMobile(String mobile){
		this.mobile=mobile;
		}
	public String getMobile(){
	 return mobile;
		}







public void displayInfo() {
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter a name: ");
    setName(userinput.nextLine()); 
   // System.out.println("You entered " + this.getName());


System.out.println("Enter a Address: ");
    setAddress(userinput.nextLine()); 
   // System.out.println("You entered " + this.getAddress());

System.out.println("Enter a mobile: ");
    setMobile(userinput.nextLine()); 
  //  System.out.println("You entered " + this.getMobile());
}

}


