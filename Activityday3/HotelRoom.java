import java.util.Scanner;

public class HotelRoom{
public static void main(String args[]){

DeluxSeaViewRoom s1=new DeluxSeaViewRoom();
DeluxRoom s2=new DeluxRoom();
SuiteRoom s3=new SuiteRoom();
//s1.displayInfo1();




//s2.displayInfo2();



//System.out.println("Verify and Update the details");
		int input=1;
Scanner scanner=new Scanner(System.in);
		//input=scanner.nextInt();
		while(input!=4)
		{
			System.out.println("Select Your Room Type");
			System.out.println("1. Delux view");
			System.out.println("2. Delux");
			System.out.println("3. Sute");
			System.out.println("4. Exit");
			
			input=scanner.nextInt();
			switch(input)
			{
			case 1:
				s1.displayInfo1();




System.out.println("---Hotel Information about--- ");
System.out.println("Hotel name :" +s1.getName());


System.out.println("Room Square Feet Area: "+s1.getArea());
System.out.println("Room has TV (yes/no): "+s1.getTv());
System.out.println("Room has Wifi (yes/no): "+s1.getWifi());
System.out.println("Room Tariff per day is:: "+s1.getRent());


				break;
			case 2:	
				s2.displayInfo2();


System.out.println("---Hotel Information about--- ");
System.out.println("Hotel name :" +s2.getName());


System.out.println("Room Square Feet Area: "+s2.getArea());
System.out.println("Room has TV (yes/no): "+s2.getTv());
System.out.println("Room has Wifi (yes/no): "+s2.getWifi());
System.out.println("Room Tariff per day is: "+s2.getRent());


				break;

			case 3:	
				s3.displayInfo3();



System.out.println("---Hotel Information about--- ");
System.out.println("Hotel name :" +s3.getName());


System.out.println("Room Square Feet Area: "+s3.getArea());
System.out.println("Room has TV (yes/no): "+s3.getTv());
System.out.println("Room has Wifi (yes/no): "+s3.getWifi());
System.out.println("Room Tariff per day is: "+s3.getRent());



				break;	

	
			
			default:
				
				break;
					
			}
		}
		
	
	}
}



