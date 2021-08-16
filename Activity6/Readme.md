Activity 6: Comparator and Comparable 

 

1. Comparator - Player List Based on Name and Skill

Write a Java program to get all player details from the user and display a player list based on the skill and name.  Display a menu to select the skill of the player as shown in the sample input and output.
Player list should be in such a way that All Rounders should be listed first, then the batsmen and then the bowlers should be displayed .Also the players should be listed in alphabetical order in each skill category.
 
 
Create Player class with below attributes,
name - String
skill - String
Add appropriate getter and setter methods for Player class
Create constructor for Player class with arguments name and skill.
Create PlayerComparator class implementing Comparator and implementing the below method,
public int compare(Player player1, Player player2);

The compare method compares the two player object based on the skill and name. This method retruns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.

Or

Use Lambda Expression to solve it

Create a main class "Main.java"

Read all the inputs in the Main class and store the list of players in ArrayList. Use Collections.sort() method to sort the list and pass the custom comparator.
 
 
Input and Output Format:
First input corresponds to the number of players and followed by the details of the players.
Refer sample input and output for formatting specifications.
 
[All text in bold corresponds to input and the rest corresponds to output]
Sample Input/Output :
Please provide the number of players to be registered
3
Please enter player name
Virat Kohli
Please select the skill of the player
1.All Rounder
2.Batsman
3.Bowler
2
Please enter player name
MS Dhoni
Please select the skill of the player
1.All Rounder
2.Batsman
3.Bowler
1
Please enter player name
Ashwin
Please select the skill of the player
1.All Rounder
2.Batsman
3.Bowler
3
Player Details
Player : Ashwin Skill  : All Rounder
Player : Virat Kohli Skill  : Batsman
Player : MS Dhoni Skill  : Bowler

 

 

 

2.Comparator - Team name and Number of matches

Write a Java program to get the team name and number of matches played by the team from the user and display a report with team name and number of matches sorted based on the number of batches in ascending order. Use Collection.sort() method to perform the sorting in your main class. Send the Comparator object as second argument to the sort method to use this comparator for sorting.
 
 
Create Team class with below attributes,
name - String
numberOfMatches - Long
Include a constructor accepting Team name and number of matches as arguments
Add appropriate getter and setter methods for Team class
 
Create TeamComparator implementing Comparator interface
Implement compare method to compare two team objects based on their number of matches played.

Or

Use Lambda Expression to solve it

Create a main class "TeamMain.java"

Input and Output Format:
First input corresponds to the number of teams and followed by each team information.
Refer sample input and output for formatting specifications.
 
 [All text in bold corresponds to input and the rest corresponds to output]
Sample Input/Output :
Enter number of teams:
 3
Enter team 1 detail
Enter Name
 Chennai super Kings
Enter number of matches
 132
Enter team 2 detail
Enter Name
 Royal Challengers Bangalore
Enter number of matches
 139
Enter team 3 detail
Enter Name
 Delhi Capitals
Enter number of matches
 131
Team list after sort by number of matches
Delhi Capitals – 131
Chennai super Kings – 132
Royal Challengers Bangalore -139

 

 

3. Comparable - Display Team

Write a Java program to get the team names and player names from the user seperated by a pipe symbol. Finally display all the teams and their players sorted in ascending order based on their names.

Create Player class with single private attribute name

Add appropriate getter and setter methods for Player class

Include a constructor with single argument Player name

Implement Comparable interface in the Player class and implement the method compareTo()

Create Team class with below private attributes,

name - String

playerList - List<Player> (All player object for this team is stored in this list)

Add appropriate getter and setter methods for Team class

Include a constructor accepting Team name as a parameter

Below are the methods in Team class

addPlayer(String playername) - Add the new player to this team object

getPlayerList() - Sort the player collection and return the list

Create a main class "DisplayTeamMain.java"

Input and Output Format:

First input corresponds to the number of input elements and followed by team and player information in the format teamname|playername.

Display the player name followed by two hyphen(-)

Refer sample input and output for formatting specifications.

Sample Input/Output :

10

CSK|MS Dhoni

CSK|Sam Curran

CSK|Ambati Rayudu

RCB|Virat Kohli

RCB|Davudatt Padikkal

RCB|AB de Villiers

CSK|Suresh Raina

KKR|Eoin Morgan

KKR|Pat Cummins

KKR|Dinesh Karthick

Team and Players in ascending order

CSK

--Ambati Rayudu

--MS Dhoni

--Sam Curran

--Suresh Raina

KKR

--Dinesh Karthick

--Eoin Morgan

--Pat Cummins

RCB

--AB de villiers

--Devudatt Padikkal

--Virat Kohli
