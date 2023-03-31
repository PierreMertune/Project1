package com.skillstorm.game;

public class Player3 extends Player{
	

	public Player3(String name,int intel, int strength) {
		super(name, intel,strength);
		
		setName("Joe");
		setStrength(4);
		setIntel(10);
		
	}
	
	public void status3() {
		System.out.println("Name: " + this.getName()); 
		System.out.println("Strength: " + this.getStrength());
		System.out.println("Intelligence: " + this.getIntel());

	}
}