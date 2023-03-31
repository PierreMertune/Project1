package com.skillstorm.game;

 
import java.util.Scanner;

public class Levels {
	
	 private static Scanner in = new Scanner(System.in);
	
	 public static void StartGame() {
		 System.out.println("Welcome you have woken up in a house your realize every time you hear the beat of a drum you are transported to another room in this house your goal is to escape. ");
		 ;
		  String choice; 
		  
		  do {
		  System.out.println("Please choose your player! ");  
		  System.out.println("A. Bobby ");
		  System.out.println("B. Mickey ");
		  System.out.println("C. Joe ");
		   choice = in.nextLine();
		   
		  } while (!(choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B") || choice.equalsIgnoreCase("C")));
		  
		  if (choice.equalsIgnoreCase("A")) {
			Player user = new Player1("Bobby", 10, 4);
			  ((Player1) user).Status1();
			  System.out.println();
			  Event1(user);
			  
		  } else if (choice.equalsIgnoreCase("B")) {
			  Player user = new Player2("Mickey", 6, 7);
			  ((Player2) user).Status2();
			  System.out.println();
			  Event1(user);
			  
		  } else if (choice.equalsIgnoreCase("C")) {
			  Player user = new Player3("joe", 3, 10);
			  ((Player3) user).status3();
			  System.out.println();
			  Event1(user);
			  
		  } else if (choice.equalsIgnoreCase(choice)) {
			  StartGame();
		  }

	 }
	 
	 /////// SCENES ///// 
	 
	 public static void Event1(Player user){ 
		System.out.println("The light click on your eyes start to slowly adjust you look around and you realize you are in a home office there is a safe, a locker with the name Jessy on it and a desk. What do you do?.");
		System.out.println("A. Check the desk ");
		System.out.println("B. Try to get into the safe");
		System.out.println("C. Search the locker");
		String result = in.nextLine();
		
		if (result.equalsIgnoreCase("A")) {
			System.out.println("Solve the riddle to gain access to the safe");
			if (user instanceof Player1) {
				System.out.println("I Can Be Cracked. I Can Be Made. I Can Be Told. I Can Be Played. What Am I?");
				EasterEgg(user);
			} else if (user instanceof Player2) {
				System.out.println("If You Are Justice, Please Do Not Lie. What Is The Price For Your Blind Eye? "); 
				EasterEgg(user);
			} else if (user instanceof Player3){
				System.out.println("The Less Of Them You Have, The More One Is Worth"); 
				EasterEgg(user);
			}
			
			
		} else if (result.equalsIgnoreCase("B")) {
			System.out.println("The safe is locked");
			Event2(user);
		} else if (result.equalsIgnoreCase("C")) {
			System.out.println("As you search the locker your find a note that reads the KEY TO is a slice of Pie");
			Event2(user);
		} else if (result.equalsIgnoreCase(result)) {
			Event1(user);
		}
	}
	 public static void Event2(Player user){
		 System.out.println("The light click on your eye adjust to the light in this room you find nothing the room is empty the only thing you can see is just a are vent on the floor with a few screws holding it in place next to it you see a small tool box with a lock on it. "
		 		+ "On the other side of the vent you see a room wit a door"); 
		 System.out.println("A.Try to Remove the vent and crawl to the other side ");
			System.out.println("B. Stay in the room your in");
			System.out.println("C. Try to open the Tool box");
			String result2 = in.nextLine();
			
			if (result2.equalsIgnoreCase("A")) {
				System.out.println("You attempt to remove the vent.");
				if (user instanceof Player1) {
					System.out.println("The vent came off with the ease but due to your muscle you can fit through the vent.?");
					EasterEgg(user);
				} else if (user instanceof Player2) {
					System.out.println("You are struggling to get the vent off but right before you can get open "); 
					 System.out.println("The sound of a drum starts to echo in the room");
					Event3(user);
				} else if (user instanceof Player3){
					System.out.println("No matter what you try you can get that vent off you would need a screw drive"); 
					Event3(user);
				}
				
			} else if (result2.equalsIgnoreCase("B")) {
				Event3(user);
				
			} else if (result2.equalsIgnoreCase("C")) {
				System.out.println("The word Key is on the tool box in big letters");
				System.out.println("What is the code?");
				String key = in.nextLine();
				if (key.equalsIgnoreCase("Pie")) {
					System.out.println("You find a screw driver and run to unscrew the vent");
					if (user instanceof Player1) {
						System.out.println("The vent is off but due to your muscle you can fit through the vent.?");
						Event3(user);
					} else if (user instanceof Player2) {
						System.out.println("You made it through the vent and opened the door"); 
						EndGame2();
					} else if (user instanceof Player3){
						System.out.println("You made it through the vent and opened the door"); 
						EndGame2();
				}
				
			} else if (result2.equalsIgnoreCase(result2)) {
				Event2(user);
			}
		}
	}
	
	 public static void Event3(Player user){ // need another scene 
		 System.out.println("Its dark in this room, you find a light switch and turned it on, you realize the room your in is the master bedroom there is a desk blocking a hole in the wall leading to the outside. "
		 		+ "You don’t have a lot of time you hear foot steps approaching the door. What do you do?"); 
		 System.out.println("A. Try to move the desk out of the way and escape");
			System.out.println("B. Hide under the bed");
			System.out.println("C. Give up and lay in the bed");
			String result3 = in.nextLine();
		
			if (result3.equalsIgnoreCase("A")) {
				if (user instanceof Player1) {
					System.out.println("You ripped the desk outta the way and escaped. i guess all those hours in the gym have paid off");
					EndGame2();
				} else if (user instanceof Player2) {
					System.out.println("You barely got the desk out off the way, the demon has made it into the room and grabbed you by you foot right after you've jumped out, you start kicking and winging your body around but nothing works.");
					EndGame3();
				} else if (user instanceof Player3){
					System.out.println(" In your effort to move the desk it falls on your leg pinning you to the floor. you watch as the demon enters the room");
					EndGame3();
				} else if (result3.equalsIgnoreCase("B")) {
					EndGame3();
				} else if (result3.equalsIgnoreCase("C")) {
					EndGame3(); 
				} else if (result3.equalsIgnoreCase(result3))
					Event3(user);
			}
				
			}	
			
			
	 	
	

	
	 	//// END GAME METHODS /////
	 
	 public static void EndGame1() {
		 System.out.println("The lights never turned on, you can’t see anything when you look around. You feel a hand on your shoulders, you look over your shoulder and all you see are glowing red eyes.");
		 System.out.println("You lose! ");
		 System.out.println("Would you like to play again? Yes or No?");
		 String end = in.nextLine();
		 
		 if (end.equalsIgnoreCase("Yes")) {
			 StartGame();
		 } else if (end.equalsIgnoreCase("No")) {
			 System.out.println("Thank you for playing");
		 } else if (end.equalsIgnoreCase(end)) {
			 EndGame1(); 
		 }
	 }
	 
	 public static void EndGame2() {
		 System.out.println("Congratulations you managed to escaped!");
		 System.out.println("Would you like to play again? Yes or No?");
		 String end2 = in.nextLine();
		 
		 if (end2.equalsIgnoreCase("Yes")) {
			 StartGame();
		 } else if (end2.equalsIgnoreCase("No")) {
			 System.out.println("Thank you for playing");
		 } else if (end2.equalsIgnoreCase(end2)) {
			 EndGame2(); 
		 }
	 }
	 
	 public static void EndGame3() {
		 System.out.println(" The demon has grabbed you, there is no way to escape");
		 System.out.println("Game Over!");
		 System.out.println("Would you like to play again? Yes or No?");
		 String end3 = in.nextLine();
		 
		 if (end3.equalsIgnoreCase("Yes")) {
			 StartGame();
		 } else if (end3.equalsIgnoreCase("No")) {
			 System.out.println("Thank you for playing");
		 } else if (end3.equalsIgnoreCase(end3)) {
			 EndGame3(); 
		 }
	
	 }
	 

	 		/////////// EASTER EGG /////////////
	 public static void EasterEgg(Player user) {
		 System.out.println("What is your answer?");
		 String pick = in.nextLine();
		 if (pick.equalsIgnoreCase("A Joke")) {
			 
		 System.out.println("You unluck the safe there is a note in there that reads “ I LOST THE GAME”. You have been over come with such rage that you don’t notice the fact "
					+ "that a 10 minutes have passed before you can do anything you hear the sound of the drum ");
		 		EndGame1();
	 } else if (pick.equalsIgnoreCase("Bribe")) {
			 System.out.println("You unluck the safe there is a note in there that reads “ I LOST THE GAME”. You have been over come with such rage that you don’t notice the fact "
						+ "that a 10 minutes have passed before you can do anything you hear the sound of the drum ");
			 EndGame1();
		 } else if (pick.equalsIgnoreCase("A friend")) {
			 System.out.println("You unluck the safe there is a note in there that reads “ I LOST THE GAME”. You have been over come with such rage that you don’t notice the fact "
						+ "that a 10 minutes have passed before you can do anything you hear the sound of the drum ");
			 EndGame1();
		 } else if (pick.equalsIgnoreCase(pick)) {
			 System.out.println("Thats the wrong answer the safe is locked out for 1hr");
			 System.out.println("The sound of a drum starts to echo in the room");
			 Event2(user);
		 }
		
			 
		 }
	 	}
	 		
	 
	 
	 

