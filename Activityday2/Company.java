
import java.util.Scanner; 

public class Company{
	private String name;
	private String employees;
	private String teamlead;



	public void setName(String name){
 	this.name=name;	
		}

	public String getName(){
	 return name;
		}


	public void setEmployees(String employees){
		this.employees=employees;
		}
	public String getEmployees(){
	 return employees;
		}
	public void setTeamlead(String teamlead){
		this.teamlead=teamlead;
		}
	public String getTeamlead(){
	 return teamlead;
		}


 public void displayInfo(){
   Scanner userinput = new Scanner(System.in);
   System.out.println("Enter a Company name: ");
   setName(userinput.nextLine()); 
   // System.out.println("You entered " + this.getName());


System.out.println("Enter a Employees: ");
    setEmployees(userinput.nextLine()); 
   // System.out.println("You entered " + this.getEmployees());

System.out.println("Enter a Teamlead: ");
   setTeamlead(userinput.nextLine()); 
  //  System.out.println("You entered " + this.getTeamlead());
}   

}


