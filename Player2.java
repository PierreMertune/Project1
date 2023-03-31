package com.skillstorm.game;

public class Player2 extends Player {
	 

	public Player2( String name,int intel, int strength) {
		super(name, intel, strength); 
		setName("Mickey");
		setStrength(6);
		setIntel(7);
		
	}
		public void Status2() {
			System.out.println("Name: " + this.getName()); 
			System.out.println("Strength: " + this.getStrength());
			System.out.println("Intelligence: " + this.getIntel());
	}

}
