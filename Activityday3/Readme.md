Inheritance Activity
1.	Write a Java program to Implement this task.
 
 
Create a class Vehicle 
Include the following private data members / attributes:
make – of type String
vehicleNumber – of type String
fuelType – of type String
fuelCapacity - of type Integer
cc – of type Integer
 
Include the following public methods
Create a constructor that initializes all the data members --- public Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc)
displayMake – Display the make of the vehicle
"displayBasicInfo" – display basic information of the vehicle.
"displayDetailInfo" – An empty method.
 
 Create a class TwoWheeler that extends Vehicle
Include the following private attributes / data members:
kickStartAvailable – of type Boolean.
Include the following public methods
Include appropriate constructors.
"displayDetailInfo" – displays the availability of kick start.
 
Create a class FourWheeler that extends Vehicle
Include the following private attributes / data members:
audioSystem – of type String.
numberOfDoors – of type Integer.
Include the following public methods
Include appropriate constructors.
"displayDetailInfo" - displays the audio system and number of doors.
 
Include getter setters for all the classes.

Create a main class to test the classes defined above.

Input and Output Format:
 
Refer sample input and output for formatting specifications.
All text in bold corresponds to input and the rest corresponds to output
 
Sample Input Output 1:
 
1.Four Wheeler
2.Two Wheeler
Enter Vehicle Type:
1
Vehicle Make:
Volvo
Vehicle Number:
TN01BR9689
Fuel Type:
1.Petrol
2.Diesel
2
Fuel Capacity:
40
Engine CC:
1960
Audio System:
Beats
Number of Doors:
5
***Volvo***
---Basic Information---
Vehicle Number:TN01BR9689
Fuel Capacity:40
Fuel Type:Diesel
CC:1960
---Detail Information---
Audio System:Beats
Number of Doors:5
 
 
Sample Input and Output 2:
1.Four Wheeler
2.Two Wheeler
Enter Vehicle Type:
2
Vehicle Make:
Suzuki
Vehicle Number:
TN60Z1234
Fuel Type:
1.Petrol
2.Diesel
1
Fuel Capacity:
15
Engine CC:
150
Kick Start Available(yes/no):
yes
***Suzuki***
---Basic Information---
Vehicle Number:TN60Z1234
Fuel Capacity:15
Fuel Type:Petrol
CC:150
---Detail Information---
Kick Start Available:YES
 
2. Write a Java program to Implement this task.
 
 Create a class HotelRoom 
Include the following private data members / attributes:
hotelName – of type String
numberOfSqFeet – of type Integer
hasTV - of type Boolean
hasWifi – of type Boolean
 
Include the following public methods :
 Create a constructor that initializes all the data members
public HotelRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
"calculateTariff" – Calculates cost using the number of sq feets and cost per sq feet and returns an Integer.
"getRatePerSqFeet" - This method returns an Integer. In this case, it always returns 0
 
 Create a class DeluxeRoom that extends HotelRoom
 Include the following protected attributes / data members:
 ratePerSqFeet – of type Integer.
Include the following public methods :
Include a constructor that sets ratePerSqFeet as 10.
public HotelRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
 "getRatePerSqFeet" – returns (ratePerSqFeet + 2) if wifi is present, else returns ratePerSqFeet.
 
Create a class DeluxeSeaViewRoom that extends DeluxeRoom
Include the following public methods :
Include a constructor that sets ratePerSqFeet as 12.
 
Create a class SuiteRoom that extends HotelRoom
 Include the following private attributes / data members:
ratePerSqFeet – of type Integer. 
Include the following public methods :
Include a constructor that sets ratePerSqFeet as 15.
public HotelRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
getRatePerSqFeet – returns (ratePerSqFeet + 2) if wifi is present, else returns ratePerSqFeet.
 
Create a Main class to test the above classes.
 
Sample Input Output 1:
Hotel Tariff Calculator
1. Deluxe Room
2. Deluxe AC Room
3. Suite AC Room
Select Room Type:
1
Hotel Name:
Taj
Room Square Feet Area:
3200
Room has TV (yes/no):
yes
Room has Wifi (yes/no:
yes
Room Tariff per day is:38400
 
3.	Create abstract class as “Match”.
Add the following private members.
Data type	Field name
Int	currentscore
Float	currentover
Int	target

Use getter and setter methods.

Create another class ODIMatch that extends the Match. (50 overs)

Create another class TestMatch that extends the Match. Consider test match is in the last day. (90 Overs)

Create another class T20Match that extends the Match. (20 Overs)

Create the following abstract methods in the Match Class. Implement it in other respective class.
1.	float calculateRunRate()
2.	int calculateBalls()
3.	void display(double reqRunrate, int balls)

Create the MatchMain class and the inherited class using main method. Calculate the required runrate and number of balls for each derived class.

Sample Input and Output:
Enter the match format
1.	ODI
2.	T20
3.	Test
1
Enter the Current score
256
Enter the current Over
30
Enter the Target Score
400
Requirements:
Need 144 runs in 120 balls
Required Runrate: 7.20

2nd Sample Input and Output:
Enter the match format
1.	ODI
2.	T20
3.	Test
2
Enter the Current score
120
Enter the current Over
15
Enter the Target Score
170
Requirements:
Need 50 runs in 30 balls
Required Runrate: 10.00





