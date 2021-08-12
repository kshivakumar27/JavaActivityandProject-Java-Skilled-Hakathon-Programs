import java.util.Scanner; 
public class DeluxRoom extends HotelRoom {
	private String name;
	private double area;
	private Boolean tv;
	private Boolean wifi;
	private double rent;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Boolean getTv() {
		return tv;
	}
	public void setTv(Boolean tv) {
		this.tv = tv;
	}
	public Boolean getWifi() {
		return wifi;
	}
	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}



public void displayInfo2() {	
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter a Hotel name: ");
    setName(userinput.nextLine()); 
   


System.out.println("Enter Room Square Feet Area: ");
    setArea(userinput.nextInt()); 


System.out.println("Enter Room has TV (yes/no):");
    setTv(userinput.nextBoolean()); 

System.out.println("Enter Room has Wifi (yes/no):");
    setWifi(userinput.nextBoolean()); 

System.out.println("Enter Room Tariff per day : ");
    setRent(userinput.nextInt()); 




}
	
}
