import java.util.Scanner; 
public class FourWheeler extends VehicleMain {
	private String make;
	private String vehicleNumber;
	private String fuelType;
	private int fuelCapacity;
	private int cc;
	private String audio;
	private int doors;


	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getAudio() {
		return audio;
	}
	public void setAudio(String audio) {
		this.audio = audio;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}












/*	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
*/


public void displayInfo2() {	
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter a name: ");
    setMake(userinput.nextLine()); 
   


System.out.println("Enter a vehicleNumber: ");
    setVehicleNumber(userinput.nextLine()); 


System.out.println("Enter a fuelType: ");
    setFuelType(userinput.nextLine()); 

System.out.println("Enter a fuelCapacity: ");
    setFuelCapacity(userinput.nextInt());

System.out.println("Enter Audio System: ");
    setAudio(userinput.nextLine());


 

System.out.println("Enter a cc: ");
    setCc(userinput.nextInt()); 


 
System.out.println("Enter no of doors: ");
    setDoors(userinput.nextInt()); 




}

}
