package com.ahmi.polyinheritance;

	public class TestMonster {

	public static void main(String[] args) {
		Monster m1 = new FireMonster("fire"); 
		Monster m2 = new WaterMonster("water");
		Monster m3 = new StoneMonster("stone");
		Monster m4 = new NoAttack("toothless");
		
		System.out.println(m1.attack());
		System.out.println(m2.attack());
		System.out.println(m3.attack());
		System.out.println(m4.attack());

	}

}
