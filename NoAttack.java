package com.ahmi.polyinheritance;

public class NoAttack extends Monster {

	public NoAttack(String name) {
		super(name);
	}
	
	@Override
	public String attack() {
		return("I don't know how to attack!");
	
	}
	
}
