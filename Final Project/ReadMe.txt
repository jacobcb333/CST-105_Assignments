NFL Drafting Application

Author: Jacob Bushdiecker

Purpose: Design an applet using the Java programming language, to demonstrate sufficient knowledge and understandings of topics covered in CST 105.

Program Overview: The NFL Drafting Application will allow players to search the NFL database to view various player's stats, it will also allow the user to add players to a personalized list. Users will be able to view stats from within the list and be able to remove them as well. 

Features: 
	- Search - Allows the user to search throughout the database to find different 		players.
	- View - Allows the user to view players that are currently in the user's list.
	- View Stats - Allows the user to view the stats of the desired player.
	- Add - Allows the user to add a player to his list.
	- Remove - Lets the user remove a player from their list.
	
Design:
	-The program will use the following classes:
		*Player - This will contain private variables, to avoid modification of variables outside the instance. Will contain a no-arg constructor 		that will create a default case for everything. Contains a Constructor that will take an argument for String name, int age, int number, 		String team, float height, float weight, and String status. Finally will contain getters and setters for the private variables.
		
		*PlayerManager - This will contain the objects that call to the Player class. These objects contain all the players information. It will 		also contain an ArrayList that stores an instance of the objects from the class Player. This arrayList will expand in size for each player 		that a user adds or removes from their draft. It will user a getter and setter to call to the arrayList of objects.