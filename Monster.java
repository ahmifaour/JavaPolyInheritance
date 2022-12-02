package com.ahmi.polyinheritance;

public abstract class Monster {
	
	private String name;
	

	public Monster() {
	
	}

	
	public Monster(String name) {
		this.setName(name);
	
	}
	
	public String attack() {
		 return ("I don't know how to attack!");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
