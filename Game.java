package com.skillstorm.game;

import java.util.Scanner;

public class Game extends Levels {
	static Scanner in = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to the hsunted house."); 
		System.out.println("Please Type P to play or E to End game." );
		String choice = in.nextLine();
		
		 if (choice.equalsIgnoreCase("P")) {
			 StartGame(); 
			  
				  
		  } else if (choice.equalsIgnoreCase("E")) {
			  System.out.println("Game Over") ; 
			  
			} 
	}



		
	}


