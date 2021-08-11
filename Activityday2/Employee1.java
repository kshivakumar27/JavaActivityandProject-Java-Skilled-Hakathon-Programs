
import java.util.Scanner; 

public class Employee1{
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
   


System.out.println("Enter a Address: ");
    setAddress(userinput.nextLine()); 


System.out.println("Enter a mobile: ");
    setMobile(userinput.nextLine()); 
  





System.out.println("Verify and Update the details");
		int n=1;
		//input=scanner.nextInt();
		while(n!=4)
		{
			System.out.println("Menu");
			System.out.println("1. Update Employee name");
			System.out.println("2. Update Employee address");
			System.out.println("3. Update Employee mobile");
			System.out.println("4. All information correct/Exit");
			n=userinput.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("Current name is:"+ this.getName());
				System.out.println("Enter a name: ");
    				setName(userinput.nextLine()); 
				break;
			case 2:	
				System.out.println("Current address is:"+ this.getAddress());
				System.out.println("Enter a Address: ");
   				setAddress(userinput.nextLine()); 
				break;	
			case 3:
				System.out.println("Current mobile is:"+ this.getMobile());
				System.out.println("Enter a mobile: ");
    				setMobile(userinput.nextLine()); 
  
				break;
			case 4:
				
				break;
			}
		}



}


}



