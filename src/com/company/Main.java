package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal dog = new Animal();
	    dog.species = "dog";
	    dog.name = "Haiku";
	    dog.weight = 8.0;
	    dog.feed();

	    Phone iPhone = new Phone();
	    iPhone.screenSize = 4.5;
	    iPhone.producer = "Apple";
	    iPhone.model = "6S";
	    iPhone.operationSystem = "iOS";

	    Human me = new Human();
	    me.firstName = "Oskar";
	    me.lastName = "Jurgielaniec";
	    me.pet = dog;

	    System.out.println("Zwierzak nazywa się: " + me.pet.name);
    }
}
