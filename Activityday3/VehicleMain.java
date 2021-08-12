import java.util.Scanner;

public class VehicleMain{
public static void main(String args[]){

TwoWheeler s1=new TwoWheeler();
FourWheeler s2=new FourWheeler();

//s1.displayInfo1();




//s2.displayInfo2();



//System.out.println("Verify and Update the details");
		int input=1;
Scanner scanner=new Scanner(System.in);
		//input=scanner.nextInt();
		while(input!=3)
		{
			System.out.println("Select Your Vehicle Type");
			System.out.println("1. Bike");
			System.out.println("2. Car");
			System.out.println("3. Exit");
			
			input=scanner.nextInt();
			switch(input)
			{
			case 1:
				s1.displayInfo1();

System.out.println("Bike name :" +s1.getMake());
System.out.println("---Basic Information about Bike--- ");

System.out.println("VehicleNumber: "+s1.getVehicleNumber());
System.out.println("FuelType: "+s1.getFuelType());
System.out.println("FuelCapacity: "+s1.getFuelCapacity());
System.out.println("cc: "+s1.getCc());
System.out.println("---More deatailed Information about Bike--- ");
System.out.println("Kick start available: "+s1.getKs());


				break;
			case 2:	
				s2.displayInfo2();

System.out.println("Car name"+s2.getMake());
System.out.println("---Basic Information about car--- ");

System.out.println("name: "+s2.getVehicleNumber());
System.out.println("FuelType: "+s2.getFuelType());
System.out.println("FuelCapacity: "+s2.getFuelCapacity());
System.out.println("cc: "+s2.getCc());

System.out.println("---More deatailed Information about car--- ");
System.out.println("Audio system: "+s2.getAudio());
System.out.println("No of doors: "+s2.getDoors());

				break;	
			
			default:
				
				break;
					
			}
		}
		
	
	}
}



