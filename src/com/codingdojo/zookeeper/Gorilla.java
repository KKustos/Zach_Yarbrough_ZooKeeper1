package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println("Gorilla uses Fling: Its super effective. Energy decreased by 5");
		displayEnergy();
	}
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("Gorilla uses Nom-Nom: Its super effective. Energy increased by 10");
		displayEnergy();
	}
	public void climb() {
		this.energyLevel -= 10;
		System.out.println("Gorilla uses Climb: Its super effective. Energy decreased by 10");
		displayEnergy();
	}
}
