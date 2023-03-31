package com.skillstorm.game;

public class Player1 extends Player {
	
	public Player1(String name, int intel, int strength) {
		super(name, intel, strength);
		setName("Bobby");
		setStrength(10);
		setIntel(4);
		
	}
		
	
	
	public void Status1() {
		System.out.println("Name: " + this.getName());  
		System.out.println("Strength: " + this.getStrength());
		System.out.println("Intelligence: " + this.getIntel());
	}
}
